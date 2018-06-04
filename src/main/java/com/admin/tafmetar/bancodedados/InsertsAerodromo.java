package com.admin.tafmetar.bancodedados;

import java.util.ArrayList;
import java.util.List;

public class InsertsAerodromo {
    protected List<Aerodromos> aerodromosList = new ArrayList<>();
    private Aerodromos sbbr = new Aerodromos("sbbr", null);

    public void insertSBBR(){
        aerodromosList.add(this.sbbr);
        aerodromosList.add(new Aerodromos("sbrj", this.sbbr));
    }

}
