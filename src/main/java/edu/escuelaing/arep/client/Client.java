package edu.escuelaing.arep.client;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import com.google.gson.Gson;

public class Client {

    static int PORT;
    static int Threads = 10;

    /**
     * Metodo principal, recibe los client socket y genera workers para manejarlos
     * 
     * @throws IOException si el puerto del server esta ocupado
     */
    public static void main(String[] args) throws IOException {

        ExecutorService executioner = Executors.newFixedThreadPool(Threads);
        ArrayList<URL> urls = new ArrayList<URL>();
        URL a = new URL("https://agile-sierra-52480.herokuapp.com");
        URL b = new URL("http://agile-sierra-52480.herokuapp.com/ann/hola?andres");
        URL c = new URL("http://agile-sierra-52480.herokuapp.com/ann/hello");
        URL d = new URL("http://agile-sierra-52480.herokuapp.com/img1.jpg");
        URL e = new URL("http://agile-sierra-52480.herokuapp.com/img2.png");
        urls.add(e);
        urls.add(a);
        urls.add(b);
        urls.add(c);
        urls.add(d);
        urls.add(e);
        int i =0;
        while (i<urls.size()) {
            
                System.out.println("Conectado");
                executioner.execute(new Thread(new worker(urls.get(i))));
                i++;
            
            
        }
    }

}
