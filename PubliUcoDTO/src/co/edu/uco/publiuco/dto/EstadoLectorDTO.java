package co.edu.uco.publiuco.dto;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoLectorDTO {
    private UUID identificador;
    private String estado;
    private String descripcion;

    public EstadoLectorDTO(UUID identificador, String estado, String descripcion) {
        super();
        setIdentificador(identificador);
        setEstado(estado);
        setDescripcion(descripcion);
    }

    public EstadoLectorDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setEstado(UtilText.getUtilText().getDefaultValue());
        setDescripcion(UtilText.EMPTY);
    }

    public static EstadoLectorDTO create() {
        return new EstadoLectorDTO();
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final EstadoLectorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final String getEstado() {
        return estado;
    }

    public final EstadoLectorDTO setEstado(final String estado) {
        this.estado = UtilText.getUtilText().applyTrim(estado);
        return this;
    }

    public final String getDescripcion() {
        return descripcion;
    }

    public final EstadoLectorDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
        return this;
    }
}