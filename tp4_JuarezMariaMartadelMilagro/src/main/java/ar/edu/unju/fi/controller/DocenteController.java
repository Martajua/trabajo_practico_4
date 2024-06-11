package ar.edu.unju.fi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.collections.DocenteCollection;

@Controller
@RequestMapping("/docentes")
public class DocenteController {
	
	@GetMapping("listadoDocentes")
	public String getPageListDocentes(Model model) {
		model.addAttribute("titulo","Listado Docentes");
		model.addAttribute("docentes", DocenteCollection.getDocentes());
		return "docenteListPage";
	}
	
	
}
