package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.Materia.Modalidad;

@Service
public class MateriaCollection {
	
	public static List<Materia> materias;

	static {
		
		Materia materia1 = new Materia(023, "Programación Visual", 2, 5, Modalidad.VIRTUAL, DocenteCollection.getDocenteByLegajo(972), CarreraCollection.getCarreraByCodigo(031));
		Materia materia2 = new Materia(134, "Metodología de la Programación", 1, 6, Modalidad.PRESENCIAL, DocenteCollection.getDocenteByLegajo(1052),CarreraCollection.getCarreraByCodigo(123));
		Materia materia3 = new Materia(512, "Introducción a las Perforaciones Geológicas", 2, 4, Modalidad.VIRTUAL, DocenteCollection.getDocenteByLegajo(1292),CarreraCollection.getCarreraByCodigo(983));
		Materia materia4 = new Materia(123, "Redes y Telecomunicaciones", 3, 5, Modalidad.VIRTUAL, DocenteCollection.getDocenteByLegajo(1304),CarreraCollection.getCarreraByCodigo(273));
		Materia materia5 = new Materia(230, "Aplicaciones de Bases de Datos I", 3, 6, Modalidad.PRESENCIAL, DocenteCollection.getDocenteByLegajo(1455),CarreraCollection.getCarreraByCodigo(198));
		Materia materia6 = new Materia(402, "Prospección y Exploración", 5, 6, Modalidad.PRESENCIAL, DocenteCollection.getDocenteByLegajo(908),CarreraCollection.getCarreraByCodigo(120));
		
		materias = new ArrayList<>();
		
		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);
		materias.add(materia5);
		materias.add(materia6);
	}
	
	private List<Materia> getMaterias(){
		return materias;
	}
	
}
