package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class LectorDTO {
    private UUID identificador;
    private TipoIdentificacionDTO tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombre;
    private TipoRelacionInstitucionDTO tipoRelacionInstitucion;

    public LectorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion, String nombre, TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacion(tipoIdentificacion);
        setNumeroIdentificacion(numeroIdentificacion);
        setNombre(nombre);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
    }

    public LectorDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setTipoIdentificacion(TipoIdentificacionDTO.create());
        setNumeroIdentificacion(UtilText.EMPTY);
        setNombre(UtilText.getUtilText().getDefaultValue());
        setTipoRelacionInstitucion(null);
    }

    public static LectorDTO create() {
        return new LectorDTO();
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final LectorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final TipoIdentificacionDTO getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public final LectorDTO setTipoIdentificacion(final TipoIdentificacionDTO tipoIdentificacion) {
        this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
        return this;
    }

    public final String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public final LectorDTO setNumeroIdentificacion(final String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final LectorDTO setNombre(final String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
        return this;
    }

    public final TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }

    public final LectorDTO setTipoRelacionInstitucion(final TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = tipoRelacionInstitucion;
        return this;
    }
}