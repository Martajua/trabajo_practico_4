package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {

	private long dniAlumno;
	private String nombreAlumno;
	private String apellidoAlumno;
	private String emailAlumno;
	private long telefonoAlumno;
	private LocalDate fechaNacimientoAlumno; 
	private String domicilioAlumno;
	private String luAlumno;
	
	public Alumno() {
		super();
	}

	public Alumno(long dniAlumno, String nombreAlumno, String apellidoAlumno, String emailAlumno, long telefonoAlumno,
			LocalDate fechaNacimientoAlumno, String domicilioAlumno, String luAlumno) {
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

	public String getLuAlumno() {
		return luAlumno;
	}

	public void setLuAlumno(String luAlumno) {
		this.luAlumno = luAlumno;
	}
	
}
