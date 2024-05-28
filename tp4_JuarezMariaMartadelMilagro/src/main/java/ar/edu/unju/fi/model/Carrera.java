package ar.edu.unju.fi.model;

public class Carrera {

	private String codigoCarrera;
	private String nombreCarrera;
	private byte cantidadAniosCarrera;
	private boolean estadoCarrera;
	
	public Carrera() {
		super();
	}

	public Carrera(String codigoCarrera, String nombreCarrera, byte cantidadAniosCarrera, boolean estadoCarrera) {
		super();
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
		this.cantidadAniosCarrera = cantidadAniosCarrera;
		this.estadoCarrera = estadoCarrera;
	}

	public String getCodigoCarrera() {
		return codigoCarrera;
	}

	public void setCodigoCarrera(String codigoCarrera) {
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

	public boolean isEstadoCarrera() {
		return estadoCarrera;
	}

	public void setEstadoCarrera(boolean estadoCarrera) {
		this.estadoCarrera = estadoCarrera;
	}
	
}
