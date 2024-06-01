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
	
	public List<Carrera> getCarreras(){
		return carreras;
	}
	
    public static Carrera getCarreraByCodigo(int id) {
        return carreras.get(id);
    }
}
