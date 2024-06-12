package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.CarreraCollection;
import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.collections.MateriaCollection;
import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;

@Controller
@RequestMapping("/materias")
public class MateriaController {

	@Autowired Materia materia;
	
	@Autowired Docente docente;
	
	@Autowired Carrera carrera;
	
	@GetMapping("/listadoMaterias")
	public String getPageListMaterias(Model model) {
		model.addAttribute("titulo", "Listado Materias");
		model.addAttribute("materias", MateriaCollection.getMaterias());
		return "materiaListPage";
	}
	
	 @GetMapping("/nuevo")
	    public String getNuevaMateria(Model model) {
	        boolean edicion = false;
	        model.addAttribute("titulo", "Nueva Materia");
	        model.addAttribute("materia", new Materia()); // Usar un nuevo objeto Materia
	        model.addAttribute("edicion", edicion);
	        model.addAttribute("docentes", DocenteCollection.getDocentes());
	        model.addAttribute("carreras", CarreraCollection.getCarreras()); // Añadir carreras al modelo
	        return "materiaForm";
	    }
	    
	    @PostMapping("/guardar")
	    public ModelAndView guardarMateria(@ModelAttribute("materia") Materia materia) {       
	        ModelAndView modelView = new ModelAndView("materiaListPage");
	        Docente docente = DocenteCollection.buscarDocente(materia.getDocenteMateria().getLegajoDocente());
	        Carrera carrera = CarreraCollection.buscarCarrera(materia.getCarreraMateria().getCodigoCarrera());
	        materia.setDocenteMateria(docente);
	        materia.setCarreraMateria(carrera);
	        
	        MateriaCollection.agregarMateria(materia);
	        modelView.addObject("materias", MateriaCollection.getMaterias());    
	        return modelView;
	    }
	    
	    @GetMapping("/modificar/{codigo}")
	    public String getModificarMateria(Model model, @PathVariable(value="codigo") int codigo) {
	        Materia encontrada = MateriaCollection.buscarMateria(codigo);
	        boolean edicion = true;
	        model.addAttribute("materia", encontrada);
	        model.addAttribute("edicion", edicion);
	        model.addAttribute("docentes", DocenteCollection.getDocentes());
	        model.addAttribute("carreras", CarreraCollection.getCarreras()); 
	        return "materiaForm";
	    }
	    
	    @PostMapping("/modificar")
	    public String modificarMateria(@ModelAttribute("materia") Materia materia) {
	        Docente docente = DocenteCollection.buscarDocente(materia.getDocenteMateria().getLegajoDocente());
	        Carrera carrera = CarreraCollection.buscarCarrera(materia.getCarreraMateria().getCodigoCarrera());
	        materia.setDocenteMateria(docente);
	        materia.setCarreraMateria(carrera);
	    
	        MateriaCollection.modificarMateria(materia);
	        return "redirect:/materias/listadoMaterias";
	    }
	    
	    @GetMapping("/eliminar/{codigo}")
	    public String eliminarMateria(@PathVariable(value="codigo") int codigo) {
	        MateriaCollection.eliminarMateria(codigo);
	        return "redirect:/materias/listadoMaterias";
	    }
}
