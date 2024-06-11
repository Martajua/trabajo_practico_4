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
import ar.edu.unju.fi.model.Carrera;

@Controller
@RequestMapping("/carreras")
public class CarreraController {

	@Autowired Carrera carrera;
	
	@GetMapping("/listadoCarreras")
	public String getPageListCarreras(Model model) {
		model.addAttribute("titulo","Listado Carreras");
		model.addAttribute("carreras", CarreraCollection.getCarreras());
		return "carreraListPage";
	}
	
	@GetMapping("/nuevo")
	public String getNuevaCarrera(Model model) {
		boolean edicion = false;
		model.addAttribute("titulo", "Nueva Carrera");
		model.addAttribute("carrera", carrera);
		model.addAttribute("editar", edicion);
		return "carreraForm";
	}
	
	@PostMapping("/guardar")
	public ModelAndView guardarCarrera(@ModelAttribute("carrera") Carrera carrera) {		
		ModelAndView modelView = new ModelAndView("carreraListPage");
		CarreraCollection.agregarCarrera(carrera);
		modelView.addObject("carreras", CarreraCollection.getCarreras());	
		return modelView;
	}
	
	@GetMapping("/modificar/{codigo}")
	public String getModificarCarrera(Model model, @PathVariable(value="codigo") int codigo) {
		Carrera encontrada =  new Carrera();
		encontrada =  CarreraCollection.buscarCarrera(codigo);
		boolean edicion = true;
		model.addAttribute("carrera", encontrada);
		model.addAttribute("edicion", edicion);
		return "carreraForm";
	}
	
	@PostMapping("/modificar")
		public String modificarCarrera(@ModelAttribute("carrera") Carrera carrera) {
			CarreraCollection.modificarCarrera(carrera);
			return "redirect:/carreras/listadoCarreras";
	}
	
	
	@GetMapping("/eliminar/{codigo}")
	public String eliminarCarrera(@PathVariable(value="codigo") int codigo) {
		CarreraCollection.eliminarCarrera(codigo);
		return "redirect:/carreras/listadoCarreras";
	}
}
