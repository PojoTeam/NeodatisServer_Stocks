package com.pojoteam;

import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public class Server {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int op = 0;

        ODBServer server = ODBFactory.openServer(8000);
        server.addBase("db", "stocksdb.db");
        server.startServer(true);

        do {
            System.out.println("MENU" +
                    "\n1.- ******************************" +
                    "\n2.- Cerrar servidor.\n");
            op = Integer.parseInt(br.readLine());

            switch (op) {
                case 1:
                    break;
                case 2:
                    server.close();
                    break;
            }
        } while (op != 2);
    }
}
