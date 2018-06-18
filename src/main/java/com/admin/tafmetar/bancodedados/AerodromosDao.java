package com.admin.tafmetar.bancodedados;

import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import java.util.List;

public class AerodromosDao {

    public Aerodromos getAerodromos(final Aerodromos aerodromos) {
        ObjectContainer conn = ConnectionFactory.getConn();

        List<Aerodromos> result = conn.query(new Predicate<Aerodromos>() {
            @Override
            public boolean match(Aerodromos arg0) {
                if (arg0.equals(aerodromos)) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        return result.get(0);
    }

}
