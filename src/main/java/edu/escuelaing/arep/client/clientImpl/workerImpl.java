package edu.escuelaing.arep.client.clientImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import edu.escuelaing.arep.client.worker;

/**
 * This class manage each petition to the server
 */
public class workerImpl implements Runnable, worker {

    URL url;

    public workerImpl(URL url) {
        this.url =url;

    }

    /**
     * Run method of the worker, here it manages the petition
     */
    public void run() {
        try {
        
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        

    }

    
}
