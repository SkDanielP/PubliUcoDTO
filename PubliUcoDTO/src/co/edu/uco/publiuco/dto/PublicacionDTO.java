package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PublicacionDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private TipoAccesoDTO tipoAcceso;
    private EstadoPublicacionDTO estadoPublicacion;

    public PublicacionDTO(UUID identificador, CategoriaDTO categoria, TipoAccesoDTO tipoAcceso, EstadoPublicacionDTO estadoPublicacion) {
        setIdentificador(identificador);
        setCategoria(categoria);
        setTipoAcceso(tipoAcceso);
        setEstadoPublicacion(estadoPublicacion);
    }

    public PublicacionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setCategoria(CategoriaDTO.create());
        setTipoAcceso(TipoAccesoDTO.create());
        setEstadoPublicacion(EstadoPublicacionDTO.create());
    }

    public static PublicacionDTO create() {
        return new PublicacionDTO();
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public PublicacionDTO setCategoria(CategoriaDTO categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
        return this;
    }

    public TipoAccesoDTO getTipoAcceso() {
        return tipoAcceso;
    }

    public PublicacionDTO setTipoAcceso(TipoAccesoDTO tipoAcceso) {
        this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoDTO.create());
        return this;
    }

    public EstadoPublicacionDTO getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public PublicacionDTO setEstadoPublicacion(EstadoPublicacionDTO estadoPublicacion) {
        this.estadoPublicacion = UtilObject.getDefault(estadoPublicacion, EstadoPublicacionDTO.create());
        return this;
    }
}
