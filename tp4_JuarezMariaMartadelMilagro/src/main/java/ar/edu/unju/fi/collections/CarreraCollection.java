package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Carrera;

@Service
public class CarreraCollection {

	private static List<Carrera> carreras;

	static {

		Carrera carrera1 = new Carrera(031, "Analista Programador Universitario", (byte) 3, false);
		Carrera carrera2 = new Carrera(123, "Ingenieria Informatica", (byte) 5, true);
		Carrera carrera3 = new Carrera(983, "Tecnicatura Universitaria en Perforaciones", (byte) 3, true);
		Carrera carrera4 = new Carrera(273, "Ingeniera Industrial", (byte) 5, false);
		Carrera carrera5 = new Carrera(198, "Licenciatura en Sistemas", (byte) 5, true);
		Carrera carrera6 = new Carrera(120, "Ingenieria en Minas", (byte) 5, false);

		carreras = new ArrayList<>();

		carreras.add(carrera1);
		carreras.add(carrera2);
		carreras.add(carrera3);
		carreras.add(carrera4);
		carreras.add(carrera5);
		carreras.add(carrera6);
	}

	/**
	 * getCarreras
	 * 
	 * @return lista de carreras
	 */
	public static List<Carrera> getCarreras() {
		return carreras;
	}

	public static Carrera getCarreraByCodigo(int codigo) {
		return carreras.get(codigo);
	}

	/**
	 * buscar carrera mediante un codigo pasado por parametro
	 * 
	 * @param codigo
	 * @return una carrera
	 */
	public static Carrera buscarCarrera(int codigo) {
		for (Carrera carrera : carreras) {
			if (carrera.getCodigoCarrera() == codigo) {
				return carrera;
			}
		}
		return null;
	}
	
	/**
	 * modificar carrera ingresando el codigo a buscar y la nueva carrera a modificar
	 * @param codigo 
	 * @param nuevaCarrera
	 * @return true si se encontro el codigo y modifico la carrera
	 * @return false si no se encontro el codigo de carrera a modificar
	 */
	public static boolean modificarCarrera(int codigo, Carrera nuevaCarrera) {
    	for(int i = 0; i < carreras.size(); i++) {
    		if(carreras.get(i).getCodigoCarrera() == codigo) {
    			carreras.set(i,nuevaCarrera);
    			return true;
    		}
    	}
    	return false;
    }
	
	/**
	 * elimina una carrera por un codigo pasado por parametro
	 * @param codigo
	 * @return si el codigo es igual al codigo de alguna carrera se elimina
	 */
	public static boolean eliminarCarrera(int codigo) {
		return carreras.removeIf(carrera -> carrera.getCodigoCarrera() == codigo);
	}

}
