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

	public static List<Materia> materias = new ArrayList<>();

	/**
	 * getMaterias
	 * 
	 * @return lista de materias
	 */
	public static List<Materia> getMaterias() {

		List<Docente> listadoDocente = DocenteCollection.getDocentes();
		Docente docente1 = listadoDocente.get(0);
		Docente docente2 = listadoDocente.get(1);
		Docente docente3 = listadoDocente.get(2);
		Docente docente4 = listadoDocente.get(3);
		Docente docente5 = listadoDocente.get(4);
		Docente docente6 = listadoDocente.get(5);
		
		List<Carrera> listadoCarrera = CarreraCollection.getCarreras();
		Carrera carrera1 = listadoCarrera.get(0);
		Carrera carrera2 = listadoCarrera.get(1);
		Carrera carrera3 = listadoCarrera.get(2);
		Carrera carrera4 = listadoCarrera.get(3);
		Carrera carrera5 = listadoCarrera.get(4);
		Carrera carrera6 = listadoCarrera.get(5);
	
		if(materias.isEmpty()) {
			materias.add(new Materia(0, "Programación Visual", 2, 5, Modalidad.VIRTUAL,
					docente1, carrera1));
			materias.add(new Materia(1, "Metodología de la Programación", 1, 6, Modalidad.PRESENCIAL,
					docente2, carrera2));
			materias.add(new Materia(2, "Introducción a las Perforaciones Geológicas", 2, 4, Modalidad.VIRTUAL,
					docente3, carrera3));
			materias.add(new Materia(3, "Redes y Telecomunicaciones", 3, 5, Modalidad.VIRTUAL,
					docente4, carrera4));
			materias.add(new Materia(4, "Aplicaciones de Bases de Datos I", 3, 6, Modalidad.PRESENCIAL,
					docente5, carrera5));
			materias.add(new Materia(5, "Prospección y Exploración", 5, 6, Modalidad.PRESENCIAL,
					docente6, carrera6));
			
		}
		
		return materias;
	}
	
	public static void agregarMateria(Materia materia) {
		materias.add(materia);
	}
	
	public static Materia getMateriaByCodigo(int codigo) {
		Materia materia = new Materia();
		for (Materia m : materias) {
			if (codigo==m.getCodigoMateria()) {
				materia=m;
				return materia;
			}
		}
		return null;
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

	public static void modificarMateria( Materia materia) {
		for (Materia m : materias) {
			if (m.getCodigoMateria() == materia.getCodigoMateria()) {
				m.setNombreMateria(materia.getNombreMateria());
				m.setCursoMateria(materia.getCursoMateria());
				m.setCantidadHorasMateria(materia.getCantidadHorasMateria());;
				m.setModalidadMateria(materia.getModalidadMateria());;
				m.setDocenteMateria(materia.getDocenteMateria());
				m.setCarreraMateria(materia.getCarreraMateria());
			}
		}
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