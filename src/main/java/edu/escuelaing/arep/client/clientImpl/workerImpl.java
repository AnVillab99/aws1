package edu.escuelaing.arep.client.clientImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * This class manage each petition to the server
 */
public class WorkerImpl implements Runnable {

    URL url;

    long inicio;

    public WorkerImpl(URL url, long inici) {
        this.url = url;
        inicio = inici;

    }

    /**
     * Run method of the worker, here it manages the petition
     */
    public void run() {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = null;
            int a = 0;
            while ((inputLine = reader.readLine()) != null) {
                a++;
            }
            System.out.println(a + "                          Recibio todo");
        } catch (IOException x) {
            System.err.println(x);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecucion :" + (double) ((endTime - inicio) / 1000000000.0));
        System.out.println("muere");

    }

    
}
