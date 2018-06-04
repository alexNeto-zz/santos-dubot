package com.admin.tafmetar.bancodedados;

public class Aerodromos {

    private String aerodromo;
    private Aerodromos dependencia;

    public Aerodromos(String aerodromo, Aerodromos dependencia){
        this.aerodromo = aerodromo;
        this.dependencia = dependencia;
    }
    
    public String getAerodromo() {
        return aerodromo;
    }

    public void setAerodromo(String aerodromo) {
        this.aerodromo = aerodromo;
    }

    public Aerodromos getDependencia() {
        return dependencia;
    }

    public void setDependencia(Aerodromos dependencia) {
        this.dependencia = dependencia;
    }
}
