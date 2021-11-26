package main.java;

public class Pais {
	
	private Integer ID;
	private String nombre;
	private Integer codigoArea;
	
	
	
	public Pais() {}
	
	public Pais(Integer iD, String nombre, Integer codigoArea) {
		
		this.ID = iD;
		this.nombre = nombre;
		this.codigoArea = codigoArea;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(Integer codigoArea) {
		this.codigoArea = codigoArea;
	}

	@Override
	public String toString() {
		return "ID= " + ID + ", País= " + nombre + ", Cod. Area= " + codigoArea;
	}

	
	
	
	
	
	
	}

	
	
	
	
	

