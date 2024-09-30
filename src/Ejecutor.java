import javax.swing.*;
import java.io.IOException;

public class Ejecutor {
    public static void main(String[] args) {

        String comando = JOptionPane.showInputDialog("Introduce el comando a ejecutar: ");
        String ruta = JOptionPane.showInputDialog("Introduce la ruta para ejecutar el proceso: ");

        Interfaz inter = new Interfaz();

        int resultadoProceso = inter.dameResultadoProceso(comando, ruta);

        if(resultadoProceso != -1){
            System.out.println("El comando ejecutado ha sido: " + comando + " y se ejecutó en la ruta: " + ruta);
            System.out.println("El proceso se ejecutó correctamente");
        }
        else{
            System.out.println("ups! ha habido un error durante el intento de ejecucion del proceso");
        }



    }
}