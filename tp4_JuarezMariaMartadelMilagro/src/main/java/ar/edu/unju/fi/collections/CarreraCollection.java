package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Carrera;

@Service
public class CarreraCollection {

	private static List<Carrera> carreras;

	static {

		Carrera carrera1 = new Carrera(0, "Analista Programador Universitario", (byte) 3, "Inactiva");
		Carrera carrera2 = new Carrera(1, "Ingenieria Informatica", (byte) 5, "Activa");
		Carrera carrera3 = new Carrera(2, "Tecnicatura Universitaria en Perforaciones", (byte) 3, "Activa");
		Carrera carrera4 = new Carrera(3, "Ingeniera Industrial", (byte) 5, "Inactiva");
		Carrera carrera5 = new Carrera(4, "Licenciatura en Sistemas", (byte) 5, "Activa");
		Carrera carrera6 = new Carrera(5, "Ingenieria en Minas", (byte) 5, "Inactiva");

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

	public static void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
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
	
	public static void modificarCarrera(Carrera carrera) {
    	for(Carrera c : carreras) {
    		if(c.getCodigoCarrera() == carrera.getCodigoCarrera()) {
    			c.setCantidadAniosCarrera(carrera.getCantidadAniosCarrera());
    			c.setNombreCarrera(carrera.getNombreCarrera());
    			c.setEstadoCarrera(carrera.getEstadoCarrera());
    		}
    	}
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
