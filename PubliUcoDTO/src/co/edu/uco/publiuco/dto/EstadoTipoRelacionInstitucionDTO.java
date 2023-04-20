package co.edu.uco.publiuco.dto;

import java.util.UUID;

public final class EstadoTipoRelacionInstitucionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}

	
	
	public EstadoTipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	

}
