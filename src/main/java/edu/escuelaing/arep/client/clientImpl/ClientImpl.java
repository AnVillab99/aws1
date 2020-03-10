package edu.escuelaing.arep.client.clientImpl;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//import com.google.gson.Gson;

public class ClientImpl {

    static int PORT;
    static int Threads = 10;

    /**
     * Metodo principal, recibe los client socket y genera workers para manejarlos
     * 
     * @throws IOException si el puerto del server esta ocupado
     */
    public static void main(String[] args) throws IOException {
        int threads = Integer.parseInt(args[0]);
        ExecutorService executioner = Executors.newFixedThreadPool(threads);
        URL a = new URL("https://arep-lab-5.herokuapp.com");
        int i = 0;
        long startTime = System.nanoTime();
        while (i<threads) {

                
                executioner.execute(new Thread(new WorkerImpl(a,startTime)));
                i++;
        
        }
        executioner.shutdown();

        System.out.println("muerte general");

        
    }
}
