package ar.edu.unju.fi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.AlumnoCollection;
import ar.edu.unju.fi.model.Alumno;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
	
	Alumno alumno = new Alumno();
	
	@GetMapping("/listadoAlumnos")
	public String getPageListAlumnos(Model model) {
		model.addAttribute("titulo","Listado Alumnos");
		model.addAttribute("alumnos", AlumnoCollection.getAlumnos());
		return "alumnoListPage";
	}
	
	@GetMapping("/nuevo")
	public String getNuevoAlumno(Model model) {
		boolean edicion = false;
		model.addAttribute("titulo", "Nuevo Alumno");
		model.addAttribute("alumno", alumno);
		model.addAttribute("editar", edicion);
		return "alumnoForm";
	}
	
	@PostMapping("/guardar")
	public ModelAndView guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {		
		ModelAndView modelView = new ModelAndView("alumnoListPage");
		AlumnoCollection.agregarAlumno(alumno);
		modelView.addObject("alumnoListPage", AlumnoCollection.getAlumnos());	
		return modelView;
	}
	
	@GetMapping("/modificar/{dni}")
	public String getModificarAlumno(Model model, @PathVariable(value="dni") long dni) {
		Alumno encontrado =  new Alumno();
		encontrado =  AlumnoCollection.buscarAlumno(dni);
		boolean edicion = true;
		model.addAttribute("alumno", encontrado);
		model.addAttribute("edicion", edicion);
		return "alumnoForm";
	}
	
	@PostMapping("/modificar")
		public String modificarAlumno(@ModelAttribute("alumno") Alumno alumno) {
			AlumnoCollection.modificarAlumno(alumno);
			return "redirect:/alumnos/listadoAlumnos";
	}
	
	
	@GetMapping("/eliminar/{dni}")
	public String eliminarMateria(@PathVariable(value="dni") long dni) {
		AlumnoCollection.eliminarAlumno(dni);
		return "redirect:/alumnos/listadoAlumnos";
	}
	
	
}
