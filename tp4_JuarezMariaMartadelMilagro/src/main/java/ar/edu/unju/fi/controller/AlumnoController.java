package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import ar.edu.unju.fi.collections.AlumnoCollection;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

	
	@GetMapping("/listadoAlumnos")
	public String getPageListAlumnos(Model model) {
		model.addAttribute("titulo","Listado Alumnos");
		model.addAttribute("alumnos", AlumnoCollection.getAlumnos());
		return "alumnoListPage";
	}
}
