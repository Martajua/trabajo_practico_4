package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Docente;

@Service
public class DocenteCollection {

	private static List<Docente> docentes;
	
	static {
		Docente docente1 = new Docente(972, "Carolina", "Apaza", "caroApaza@gmail.com", 154328767);
		Docente docente2 = new Docente(1052, "Arie", "Vega", "arielVega@gmail.com", 156789332);
		Docente docente3 = new Docente(1292, "Juan Carlos", "Rodriguez", "jcrodriguez33@gmail.com", 154880234);
		Docente docente4 = new Docente(1304, "Gustavo", "Sosa", "SosaGustavo@gmail.com", 156784433);
		Docente docente5 = new Docente(1455, "Alfredo", "Espinoza", "algredo78@gmail.com", 155986745);
		Docente docente6 = new Docente(908, "Nelida", "Caceres", "nelidaCa23@gmail.com", 154873450);
		
		docentes = new ArrayList<>();
		
		docentes.add(docente1);
		docentes.add(docente2);
		docentes.add(docente3);
		docentes.add(docente4);
		docentes.add(docente5);
		docentes.add(docente6);
		
	}
	
	public List<Docente> getDocentes(){
		return docentes;
	}
	
	public static Docente getDocenteByLegajo(int id) {
	        return docentes.get(id);
	}
}
