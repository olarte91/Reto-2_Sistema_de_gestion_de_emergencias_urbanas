package service;

import java.time.LocalTime;

import utils.NivelGravedad;

public class Emergencia{
    private String tipo;
    private String ubicacion;
    private NivelGravedad nivelGravedad;
    private LocalTime tiempoRespuesta;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public NivelGravedad getNivelGravedad() {
        return nivelGravedad;
    }
    public void setNivelGravedad(NivelGravedad nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }
    public LocalTime getTiempoRespuesta() {
        return tiempoRespuesta;
    }
    public void setTiempoRespuesta(LocalTime tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}
