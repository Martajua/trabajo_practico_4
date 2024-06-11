package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
}
