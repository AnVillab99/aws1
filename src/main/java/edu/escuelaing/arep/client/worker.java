package edu.escuelaing.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * This class manage each petition to the server
 */
public class worker implements Runnable {

    URL url;

    public worker(URL url) {
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
