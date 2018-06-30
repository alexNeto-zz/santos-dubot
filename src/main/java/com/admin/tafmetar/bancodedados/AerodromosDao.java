package com.admin.tafmetar.bancodedados;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class AerodromosDao {

    private ObjectContainer conn = null;

    public boolean insertAerodromo(Aerodromo aerodromo) {
        conn = ConnectionFactory.getConn();
        conn.store(aerodromo);
        return true;
    }

    public Aerodromo selectAerodromo(Aerodromo aerodromo) {
        conn = ConnectionFactory.getConn();
        ObjectSet<Aerodromo> aerodromos = conn.queryByExample(aerodromo);
        return aerodromos.next();
    }


}