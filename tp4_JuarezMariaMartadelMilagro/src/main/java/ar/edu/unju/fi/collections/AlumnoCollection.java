package ar.edu.unju.fi.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Alumno;

@Service
public class AlumnoCollection {

public static List<Alumno> alumnos;
	
	static {
		Alumno alumno1 = new Alumno(39931069, "María Marta", "Juarez", "martajua38@gmail.com", 155705777, LocalDate.now(), "Doctor Vidal 1070", 3642);
		Alumno alumno2 = new Alumno(35794895, "Camila", "Acedo", "camA12@hotmail.com", 156897654, LocalDate.now(), "Pasaje Francia 456", 7689);
		Alumno alumno3 = new Alumno(34153100, "Joaquin", "Castro", "joaco89@gmail.com", 154672345, LocalDate.now(), "Coronel Davila 342", 8102);
		Alumno alumno4 = new Alumno(32507440, "Tatiana", "Jaeger", "jaeTati45@gmail.com", 157908745, LocalDate.now(), "Independencia 787", 1984);
		Alumno alumno5 = new Alumno(27610668, "Jorge", "Ybañez", "Jorge_53@hotmail.com", 155342909, LocalDate.now(), "Balcarce 980", 2234);
		Alumno alumno6 = new Alumno(30332656, "Cesar", "Soria", "cesarSo@hotmail.com", 154378456, LocalDate.now(), "Jorge Newbery 34", 3455);
		
		alumnos = new ArrayList<>();
		
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		alumnos.add(alumno4);
		alumnos.add(alumno5);
		alumnos.add(alumno6);
	}
	
	
	public List<Alumno> getAlumnos(){
		return alumnos;
	}
	
}
