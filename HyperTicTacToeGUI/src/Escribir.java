import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

class Escribir extends Thread {

    Socket socket;
    String name;
    Scanner entrada;

    Escribir(Socket socket) {      //Recibe objeto de tipo Socket para identificar el Socket que está ejecutando el proceso y
        // en el parámetro name recibirá como el cliente desea ser nombrado
        entrada = new Scanner(System.in);  //Objeto para recibir datos desde teclado
        this.socket = socket;
        start();  //Inicia el Hilo, se llama automáticamente al método run()
    }

    public void run() {

        try {

            boolean terminar = false;
            String mensaje;
            while (!terminar) {      // Creamos bucle infinito para escritura
                OutputStream os = socket.getOutputStream();
                DataOutputStream flujoDOS = new DataOutputStream(os);
                System.out.println("Escribe tu mensaje " + name + ": ");
                mensaje = entrada.nextLine();
                if (mensaje.equals("salir")) // El bucle se romperá al ingresar la palabra Salir por teclado
                {
                    terminar = true;
                } else {
                    flujoDOS.writeUTF(name + " dice: " + mensaje);  //Si no se ingresa salir, se envía mensaje de escritura
                }
            }
            socket.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
