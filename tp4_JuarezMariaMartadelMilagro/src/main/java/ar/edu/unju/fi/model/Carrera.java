package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Carrera {

	private int codigoCarrera;
	private String nombreCarrera;
	private byte cantidadAniosCarrera;
	private String estadoCarrera;
	
	public Carrera() {
		super();
	}

	public Carrera(int codigoCarrera, String nombreCarrera, byte cantidadAniosCarrera, String estadoCarrera) {
		super();
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
		this.cantidadAniosCarrera = cantidadAniosCarrera;
		this.estadoCarrera = estadoCarrera;
	}

	public int getCodigoCarrera() {
		return codigoCarrera;
	}

	public void setCodigoCarrera(int codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public byte getCantidadAniosCarrera() {
		return cantidadAniosCarrera;
	}

	public void setCantidadAniosCarrera(byte cantidadAniosCarrera) {
		this.cantidadAniosCarrera = cantidadAniosCarrera;
	}

	public String getEstadoCarrera() {
		return estadoCarrera;
	}

	public void setEstadoCarrera(String estadoCarrera) {
		this.estadoCarrera = estadoCarrera;
	}

	@Override
	public String toString() {
		return "Carrera: " + nombreCarrera;
	}
	
	
}
