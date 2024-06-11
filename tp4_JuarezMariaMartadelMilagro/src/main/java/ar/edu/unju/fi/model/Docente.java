package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Docente {
	private int legajoDocente;
	private String nombreDocente;
	private String apellidoDocente;
	private String emailDocente;
	private long telefonoDocente;
	
	public Docente() {
		super();
	}

	public Docente(int legajoDocente, String nombreDocente, String apellidoDocente, String emailDocente,
			long telefonoDocente) {
		super();
		this.legajoDocente = legajoDocente;
		this.nombreDocente = nombreDocente;
		this.apellidoDocente = apellidoDocente;
		this.emailDocente = emailDocente;
		this.telefonoDocente = telefonoDocente;
	}

	public int getLegajoDocente() {
		return legajoDocente;
	}

	public void setLegajoDocente(int legajoDocente) {
		this.legajoDocente = legajoDocente;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public String getApellidoDocente() {
		return apellidoDocente;
	}

	public void setApellidoDocente(String apellidoDocente) {
		this.apellidoDocente = apellidoDocente;
	}

	public String getEmailDocente() {
		return emailDocente;
	}

	public void setEmailDocente(String emailDocente) {
		this.emailDocente = emailDocente;
	}

	public long getTelefonoDocente() {
		return telefonoDocente;
	}

	public void setTelefonoDocente(long telefonoDocente) {
		this.telefonoDocente = telefonoDocente;
	}
	
}
