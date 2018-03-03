package com.admin.tafmetar.enumerate;

public enum TargetType {
    TAF(1),
    METAR(2),
    AERODROME(3);

    private final int valor;
    TargetType(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
}
