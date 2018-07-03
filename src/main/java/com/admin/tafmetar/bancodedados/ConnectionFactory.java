package com.admin.tafmetar.bancodedados;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import java.util.UUID;

public class ConnectionFactory {

    public static ObjectContainer conn;

    public static ObjectContainer getConn() {
        if (conn == null) {
            UUID hash = UUID.randomUUID();
            return conn = Db4oEmbedded.openFile(Db4oEmbedded
                    .newConfiguration(), hash + ".lag");
        } else {
            return conn;
        }
    }
}
