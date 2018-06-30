package com.admin.tafmetar.bancodedados;

import com.db4o.ObjectContainer;

import java.util.List;

public class PopulateAerodromos {

    public Boolean insertAll() {
        List<Aerodromo> aerodromoList = new InsertsAerodromo().getAerodromoList();
        AerodromosDao aerodromosDao = new AerodromosDao();
        aerodromoList.forEach(aerodromosDao::insertAerodromo);
        return true;
    }
}
