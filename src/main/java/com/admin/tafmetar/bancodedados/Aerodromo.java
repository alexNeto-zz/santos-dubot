package com.admin.tafmetar.bancodedados;

public class Aerodromo {

    private String aerodromo;
    private Aerodromo dependencia;

    public Aerodromo(String aerodromo, Aerodromo dependencia){
        this.aerodromo = aerodromo;
        this.dependencia = dependencia;
    }
    
    public String getAerodromo() {
        return aerodromo;
    }

    public void setAerodromo(String aerodromo) {
        this.aerodromo = aerodromo;
    }

    public Aerodromo getDependencia() {
        return dependencia;
    }

    public void setDependencia(Aerodromo dependencia) {
        this.dependencia = dependencia;
    }

    @Override
    public String toString(){
        return "Aerodromo: " + this.aerodromo + "\tDependência: " + this.dependencia;
    }
}
