package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;


public class EstadoTipoRelacionInstitucionDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	
	public EstadoTipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		}
	
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public static EstadoTipoRelacionInstitucionDTO create() {
		return new EstadoTipoRelacionInstitucionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 
		
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	
	public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(nombre);
		
		return this;
	}


	
}