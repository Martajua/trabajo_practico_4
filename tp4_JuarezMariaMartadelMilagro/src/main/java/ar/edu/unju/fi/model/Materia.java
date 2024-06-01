package ar.edu.unju.fi.model;

public class Materia {

	private int codigoMateria;
	private String nombreMateria;
	private int cursoMateria;
	private int cantidadHorasMateria;
	private Modalidad modalidadMateria;
	private Docente docenteMateria;
	private Carrera carreraMateria;
	
	public enum Modalidad{
		VIRTUAL, PRESENCIAL;
	}

	public Materia() {
		super();
	}

	public Materia(int codigoMateria, String nombreMateria, int cursoMateria, int cantidadHorasMateria,
			Modalidad modalidadMateria, Docente docenteMateria, Carrera carreraMateria) {
		super();
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.cursoMateria = cursoMateria;
		this.cantidadHorasMateria = cantidadHorasMateria;
		this.modalidadMateria = modalidadMateria;
		this.docenteMateria = docenteMateria;
		this.carreraMateria = carreraMateria;
	}

	public int getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(int codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public int getCursoMateria() {
		return cursoMateria;
	}

	public void setCursoMateria(int cursoMateria) {
		this.cursoMateria = cursoMateria;
	}

	public int getCantidadHorasMateria() {
		return cantidadHorasMateria;
	}

	public void setCantidadHorasMateria(int cantidadHorasMateria) {
		this.cantidadHorasMateria = cantidadHorasMateria;
	}

	public Modalidad getModalidadMateria() {
		return modalidadMateria;
	}

	public void setModalidadMateria(Modalidad modalidadMateria) {
		this.modalidadMateria = modalidadMateria;
	}

	public Docente getDocenteMateria() {
		return docenteMateria;
	}

	public void setDocenteMateria(Docente docenteMateria) {
		this.docenteMateria = docenteMateria;
	}

	public Carrera getCarreraMateria() {
		return carreraMateria;
	}

	public void setCarreraMateria(Carrera carreraMateria) {
		this.carreraMateria = carreraMateria;
	}

}

