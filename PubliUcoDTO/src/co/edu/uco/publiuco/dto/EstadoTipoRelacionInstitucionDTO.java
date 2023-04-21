package co.edu.uco.publiuco.dto;

import java.util.UUID;

public final class EstadoTipoRelacionInstitucionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public static final String valorDefectoNombre = "activo";
	public static final String valorDefectoDescripcion = "descripcion vacia";

	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(identificador);
		setNombre(valorDefectoNombre);
		setDescripcion(valorDefectoDescripcion);
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
