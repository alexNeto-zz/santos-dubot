package com.admin.tafmetar.bancodedados;

import com.db4o.ObjectContainer;

import java.util.List;

public class PopulateAerodromos {

    public Boolean insertAll() {
        Boolean result = true;
        try {
            makeInserts();
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public void makeInserts() throws Exception {
        ObjectContainer conn = ConnectionFactory.getConn();
        List<Aerodromos> aerodromosLit = new InsertsAerodromo().getAerodromosList();
        aerodromosLit.forEach(conn::store);
        conn.close();
    }
}
