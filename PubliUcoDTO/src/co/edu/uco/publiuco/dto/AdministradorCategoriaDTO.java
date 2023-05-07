package co.edu.uco.publiuco.dto;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class AdministradorCategoriaDTO {
    private UUID identificador;
    private String nombre;
    private String correo;
    private TipoRelacionInstitucionDTO tipoRelacionInstitucion;
    private EstadoAdministradorCategoriaDTO estado;

    public AdministradorCategoriaDTO(UUID identificador, String nombre, String correo, TipoRelacionInstitucionDTO tipoRelacionInstitucion, EstadoAdministradorCategoriaDTO estado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setCorreo(correo);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
        setEstado(estado);
    }

    public AdministradorCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getUtilText().getDefaultValue());
        setCorreo(UtilText.EMPTY);
        setTipoRelacionInstitucion(null);
        setEstado(null);
    }

    public static AdministradorCategoriaDTO create() {
        return new AdministradorCategoriaDTO();
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final AdministradorCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final AdministradorCategoriaDTO setNombre(final String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
        return this;
    }

    public final String getCorreo() {
        return correo;
    }

    public final AdministradorCategoriaDTO setCorreo(final String correo) {
        this.correo = UtilText.getUtilText().applyTrim(correo);
        return this;
    }

    public final TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }

    public final AdministradorCategoriaDTO setTipoRelacionInstitucion(final TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = tipoRelacionInstitucion;
        return this;
    }

    public final EstadoAdministradorCategoriaDTO getEstado() {
        return estado;
    }

    public final AdministradorCategoriaDTO setEstado(final EstadoAdministradorCategoriaDTO estado) {
        this.estado = estado;
        return this;
    }
}