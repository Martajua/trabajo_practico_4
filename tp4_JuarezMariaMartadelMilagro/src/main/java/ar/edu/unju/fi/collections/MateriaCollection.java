package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.Materia.Modalidad;


@Service
public class MateriaCollection {

	public static List<Materia> materias;

	/**
	 * getMaterias
	 * 
	 * @return lista de materias
	 */
	public static List<Materia> getMaterias() {
		List<Docente> listadoDocente = DocenteCollection.getDocentes();
		Docente docente1 = listadoDocente.get(972);
		Docente docente2 = listadoDocente.get(1052);
		Docente docente3 = listadoDocente.get(1292);
		Docente docente4 = listadoDocente.get(1304);
		Docente docente5 = listadoDocente.get(1455);
		Docente docente6 = listadoDocente.get(908);
		
		List<Carrera> listadoCarrera = CarreraCollection.getCarreras();
		Carrera carrera1 = listadoCarrera.get(031);
		Carrera carrera2 = listadoCarrera.get(123);
		Carrera carrera3 = listadoCarrera.get(983);
		Carrera carrera4 = listadoCarrera.get(273);
		Carrera carrera5 = listadoCarrera.get(198);
		Carrera carrera6 = listadoCarrera.get(120);
	
		if(materias.isEmpty()) {
			Materia materia1 = new Materia(023, "Programación Visual", 2, 5, Modalidad.VIRTUAL,
					docente1, carrera1);
			Materia materia2 = new Materia(134, "Metodología de la Programación", 1, 6, Modalidad.PRESENCIAL,
					docente2, carrera2);
			Materia materia3 = new Materia(512, "Introducción a las Perforaciones Geológicas", 2, 4, Modalidad.VIRTUAL,
					docente3, carrera3);
			Materia materia4 = new Materia(123, "Redes y Telecomunicaciones", 3, 5, Modalidad.VIRTUAL,
					docente4, carrera4);
			Materia materia5 = new Materia(230, "Aplicaciones de Bases de Datos I", 3, 6, Modalidad.PRESENCIAL,
					docente5, carrera5);
			Materia materia6 = new Materia(402, "Prospección y Exploración", 5, 6, Modalidad.PRESENCIAL,
					docente6, carrera6);
			
			materias = new ArrayList<>();

			materias.add(materia1);
			materias.add(materia2);
			materias.add(materia3);
			materias.add(materia4);
			materias.add(materia5);
			materias.add(materia6);
		}
		
		return materias;
	}

	public static Materia getMateriaByCodigo(int codigo) {
		Materia materia = new Materia();
		for (Materia m : materias) {
			if (codigo==m.getCodigoMateria()) {
				materia=m;
				break;
			}
		}
		return materia;
	}

	/**
	 * buscar materia mediante un codigo pasado por parametro
	 * 
	 * @param codigo
	 * @return
	 */
	public static Materia buscarMateria(int codigo) {
		for (Materia materia : materias) {
			if (materia.getCodigoMateria() == codigo) {
				return materia;
			}
		}
		return null;
	}

	/**
	 * modificar materia ingresando un codigo a buscar y la materia a modificar
	 * 
	 * @param codigo
	 * @param nuevaMateria
	 * @return true si se encontro el codigo y se modifico la materia
	 * @return false si no se encontro el codigo de la materia
	 */
	public static boolean modificarAlumno(int codigo, Materia nuevaMateria) {
		for (int i = 0; i < materias.size(); i++) {
			if (materias.get(i).getCodigoMateria() == codigo) {
				materias.set(i, nuevaMateria);
				return true;
			}
		}
		return false;
	}

	/**
	 * elimina una materia por un codigo pasado por parametro
	 * 
	 * @param codigo
	 * @return si el codigo es igual al codigo de alguna materia se elimina
	 */
	public static boolean eliminarMateria(int codigo) {
		return materias.removeIf(materia -> materia.getCodigoMateria() == codigo);
	}
}