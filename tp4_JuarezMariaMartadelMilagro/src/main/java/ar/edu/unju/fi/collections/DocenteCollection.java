package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Docente;

@Service
public class DocenteCollection {

	private static List<Docente> docentes;
	
	static {
		Docente docente1 = new Docente(0, "Carolina", "Apaza", "caroApaza@gmail.com", 154328767);
		Docente docente2 = new Docente(1, "Ariel", "Vega", "arielVega@gmail.com", 156789332);
		Docente docente3 = new Docente(2, "Juan Carlos", "Rodriguez", "jcrodriguez33@gmail.com", 154880234);
		Docente docente4 = new Docente(3, "Gustavo", "Sosa", "SosaGustavo@gmail.com", 156784433);
		Docente docente5 = new Docente(4, "Alfredo", "Espinoza", "algredo78@gmail.com", 155986745);
		Docente docente6 = new Docente(5, "Nelida", "Caceres", "nelidaCa23@gmail.com", 154873450);
		
		docentes = new ArrayList<>();
		
		docentes.add(docente1);
		docentes.add(docente2);
		docentes.add(docente3);
		docentes.add(docente4);
		docentes.add(docente5);
		docentes.add(docente6);
		
	}
	
	/**
	 * getDocentes
	 * @return lista de docentes
	 */
	public static List<Docente> getDocentes(){
		return docentes;
	}
	
	public static Docente getDocenteByLegajo(int id) {
	        return docentes.get(id);
	}
	
	/**
	 * busca un docente segun el legajo pasado por parametro
	 * @param legajo
	 * @return carrera
	 */
	public static Docente buscarDocente(int legajo) {
		for (Docente docente : docentes) {
			if (docente.getLegajoDocente() == legajo) {
				return docente;
			}
		}
		return null;
	}
	
	/**
	 * modifica docente ingresando el legajo a buscar y el nuevo docente a modificar
	 * @param legajo
	 * @param nuevoDocente
	 * @return true si se encotro el legajo y se modifica el docente
	 * @return false si no se contro el legajo del docente a modificar
	 */
	public static boolean modificarDocente(int legajo, Docente nuevoDocente) {
		for (int i = 0; i < docentes.size(); i++) {
			if(docentes.get(i).getLegajoDocente() == legajo) {
				docentes.set(i, nuevoDocente);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * elimina un docente por un legajo pasdo por parametro
	 * @param legajo
	 * @return
	 */
	public static boolean eliminarDocente(int legajo) {
		return docentes.removeIf(docente -> docente.getLegajoDocente() == legajo);
	}
}
