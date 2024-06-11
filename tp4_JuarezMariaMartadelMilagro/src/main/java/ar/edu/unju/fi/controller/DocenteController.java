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

import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.model.Docente;

@Controller
@RequestMapping("/docentes")
public class DocenteController {
	
	@Autowired Docente docente;
	
	@GetMapping("/listadoDocentes")
	public String getPageListDocentes(Model model) {
		model.addAttribute("titulo","Listado Docentes");
		model.addAttribute("docentes", DocenteCollection.getDocentes());
		return "docenteListPage";
	}
	
	@GetMapping("/nuevo")
	public String getNuevoDocente(Model model) {
		boolean edicion = false;
		model.addAttribute("titulo", "Nuevo Docente");
		model.addAttribute("docente", docente);
		model.addAttribute("editar", edicion);
		return "docenteForm";
	}
	
	@PostMapping("/guardar")
	public ModelAndView guardarDocente(@ModelAttribute("carrera") Docente docente) {		
		ModelAndView modelView = new ModelAndView("docenteListPage");
		DocenteCollection.agregarDocente(docente);
		modelView.addObject("docentes", DocenteCollection.getDocentes());	
		return modelView;
	}
	
	@GetMapping("/modificar/{legajo}")
	public String getModificarDocente(Model model, @PathVariable(value="legajo") int legajo) {
		Docente encontrado =  new Docente();
		encontrado = DocenteCollection.buscarDocente(legajo);
		boolean edicion = true;
		model.addAttribute("docente", encontrado);
		model.addAttribute("edicion", edicion);
		return "docenteForm";
	}
	
	@PostMapping("/modificar")
		public String modificarDocente(@ModelAttribute("docente") Docente docente) {
			DocenteCollection.modificarDocente(docente);
			return "redirect:/docentes/listadoDocentes";
	}
	
	
	@GetMapping("/eliminar/{legajo}")
	public String eliminarDocente(@PathVariable(value="legajo") int legajo) {
		DocenteCollection.eliminarDocente(legajo);
		return "redirect:/docentes/listadoDocentes";
	}
	
}
