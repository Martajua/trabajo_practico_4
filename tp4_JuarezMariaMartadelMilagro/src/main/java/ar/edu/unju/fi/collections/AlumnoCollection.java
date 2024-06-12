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
		Alumno alumno1 = new Alumno(39931069L, "María Marta", "Juarez", "martajua38@gmail.com", 155705777L,
				LocalDate.now(), "Doctor Vidal 1070", 3642);
		Alumno alumno2 = new Alumno(35794895L, "Camila", "Acedo", "camA12@hotmail.com", 156897654L, LocalDate.now(),
				"Pasaje Francia 456", 7689);
		Alumno alumno3 = new Alumno(34153100L, "Joaquin", "Castro", "joaco89@gmail.com", 154672345L, LocalDate.now(),
				"Coronel Davila 342", 8102);
		Alumno alumno4 = new Alumno(32507440L, "Tatiana", "Jaeger", "jaeTati45@gmail.com", 157908745L, LocalDate.now(),
				"Independencia 787", 1984);
		Alumno alumno5 = new Alumno(27610668L, "Jorge", "Ybañez", "Jorge_53@hotmail.com", 155342909L, LocalDate.now(),
				"Balcarce 980", 2234);
		Alumno alumno6 = new Alumno(30332656L, "Cesar", "Soria", "cesarSo@hotmail.com", 154378456L, LocalDate.now(),
				"Jorge Newbery 34", 3455);

		alumnos = new ArrayList<>();

		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		alumnos.add(alumno4);
		alumnos.add(alumno5);
		alumnos.add(alumno6);
	}

	/**
	 * getAlumnos
	 * 
	 * @return lista de alumnos
	 */
	public static List<Alumno> getAlumnos() {
		return alumnos;
	}

	/**
	 * Añadir un alumno nuevo a la lista.
	 * 
	 * @param alumno Alumno a agregar
	 */
	public static void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}

	/**
	 * buscar un alumno mediante el dni
	 * 
	 * @param dni
	 * @return
	 */
	public static Alumno buscarAlumno(long dni) {
		for (Alumno alumno : alumnos) {
			if (alumno.getDniAlumno() == dni) {
				return alumno;
			}
		}
		return null;
	}

	public static void modificarAlumno(Alumno alumno) {
		for (Alumno a : alumnos) {
			if (a.getDniAlumno() == alumno.getDniAlumno()) {
				a.setDniAlumno(alumno.getDniAlumno());
				a.setLuAlumno(alumno.getLuAlumno());
				a.setApellidoAlumno(alumno.getApellidoAlumno());
				a.setNombreAlumno(alumno.getNombreAlumno());
				a.setEmailAlumno(alumno.getEmailAlumno());
				a.setDomicilioAlumno(alumno.getDomicilioAlumno());
				a.setFechaNacimientoAlumno(alumno.getFechaNacimientoAlumno());
				a.setTelefonoAlumno(alumno.getTelefonoAlumno());
			}
		}

	}

	/**
	 * elimina un alumno por el dni pasado por parametro
	 * 
	 * @param dni
	 * @return si el dni es igual al dni del alumno se elimina
	 */
	public static boolean eliminarAlumno(long dni) {
		return alumnos.removeIf(alumno -> alumno.getDniAlumno() == dni);
	}
}
