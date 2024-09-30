import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interfaz {



     public int dameResultadoProceso(String comando, String ruta){
         ProcessBuilder processBuilder = new ProcessBuilder(comando, ruta);
         int exitCode = -1;

         try {
             Process process = processBuilder.start();

             BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
             String line;
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }

             exitCode = process.waitFor();
         } catch (IOException e) {
             System.out.println("Error al ejecutar el proceso: " + e.getMessage());
         } catch (InterruptedException e) {
             System.out.println("El proceso fue interrumpido: " + e.getMessage());
         }

         return exitCode;
     }
     }




