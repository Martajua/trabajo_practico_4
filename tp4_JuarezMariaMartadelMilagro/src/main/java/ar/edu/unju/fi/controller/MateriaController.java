package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.collections.MateriaCollection;

@Controller
@RequestMapping("/materias")
public class MateriaController {

	@GetMapping("listadoMaterias")
	public String getPageListMaterias(Model model) {
		model.addAttribute("titulo", "Listado Materias");
		model.addAttribute("materias", MateriaCollection.getMaterias());
		return "materiaListPage";
	}
}
