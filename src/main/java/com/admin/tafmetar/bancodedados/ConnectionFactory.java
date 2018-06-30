package com.admin.tafmetar.bancodedados;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class ConnectionFactory {

    public static ObjectContainer conn;

    public static ObjectContainer getConn() {
        if (conn == null) {
            return conn = Db4oEmbedded.openFile(Db4oEmbedded
                    .newConfiguration(), "database.lag");
        } else {
            return conn;
        }
    }
}
