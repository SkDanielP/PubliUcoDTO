package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CalificacionDTO {
    private UUID identificador;
    private LectorDTO lector;
    private PublicacionDTO publicacion;

    public CalificacionDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion) {
        setIdentificador(identificador);
        setLector(lector);
        setPublicacion(publicacion);
    }

    public CalificacionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setLector(LectorDTO.create());
        setPublicacion(PublicacionDTO.create());
    }

    public static CalificacionDTO create() {
        return new CalificacionDTO();
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CalificacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public CalificacionDTO setLector(LectorDTO lector) {
        this.lector = UtilObject.getDefault(lector, LectorDTO.create());
        return this;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public CalificacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

 

}
