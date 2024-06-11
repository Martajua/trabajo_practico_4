package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Alumno {

	private long dniAlumno;
	private String nombreAlumno;
	private String apellidoAlumno;
	private String emailAlumno;
	private long telefonoAlumno;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate fechaNacimientoAlumno; 
	private String domicilioAlumno;
	private int luAlumno;
	
	public Alumno() {
		super();
	}

	public Alumno(long dniAlumno, String nombreAlumno, String apellidoAlumno, String emailAlumno, long telefonoAlumno,
			LocalDate fechaNacimientoAlumno, String domicilioAlumno, int luAlumno) {
		super();
		this.dniAlumno = dniAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.emailAlumno = emailAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
		this.domicilioAlumno = domicilioAlumno;
		this.luAlumno = luAlumno;
	}

	public long getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(long dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public String getEmailAlumno() {
		return emailAlumno;
	}

	public void setEmailAlumno(String emailAlumno) {
		this.emailAlumno = emailAlumno;
	}

	public long getTelefonoAlumno() {
		return telefonoAlumno;
	}

	public void setTelefonoAlumno(long telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public LocalDate getFechaNacimientoAlumno() {
		return fechaNacimientoAlumno;
	}

	public void setFechaNacimientoAlumno(LocalDate fechaNacimientoAlumno) {
		this.fechaNacimientoAlumno = fechaNacimientoAlumno;
	}

	public String getDomicilioAlumno() {
		return domicilioAlumno;
	}

	public void setDomicilioAlumno(String domicilioAlumno) {
		this.domicilioAlumno = domicilioAlumno;
	}

	public int getLuAlumno() {
		return luAlumno;
	}

	public void setLuAlumno(int luAlumno) {
		this.luAlumno = luAlumno;
	}
	
}
