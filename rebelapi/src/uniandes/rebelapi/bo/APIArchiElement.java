package uniandes.rebelapi.bo;

import java.util.ArrayList;

/**
 * Esta clase se usa para almacenar el estado y relaciones de un elemento de archimate.
 * Los elementos son los seleccionados en el BOI 
 * @author borisperezg
 *
 */
public class APIArchiElement {

	private String nombre, accion; // La acción por ahora como texto. Luego como ENUM
	private ArrayList<APIArchiRelation> relacionesEntrantes;
	private ArrayList<APIArchiRelation> relacionesSalientes;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<APIArchiRelation> getRelacionesEntrantes() {
		return relacionesEntrantes;
	}
	public void setRelacionesEntrantes(ArrayList<APIArchiRelation> relacionesEntrantes) {
		this.relacionesEntrantes = relacionesEntrantes;
	}
	public ArrayList<APIArchiRelation> getRelacionesSalientes() {
		return relacionesSalientes;
	}
	public void setRelacionesSalientes(ArrayList<APIArchiRelation> relacionesSalientes) {
		this.relacionesSalientes = relacionesSalientes;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	
	
}
