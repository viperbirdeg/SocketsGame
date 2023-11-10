
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author victo
 */
public class AtiendeClientes extends Thread { //Creamos proceso

    Socket socket;
    String mensaje;
    ArrayList<Socket> listaCliente;
    int cliente;

    AtiendeClientes(ArrayList<Socket> lista, Socket socket) // Recibe el ArrayList de Sockets Cliente que actualmente se están atendiendo
    {
        this.listaCliente = lista;
        this.socket = socket;
        start();
    }

    public void run() {
        while (true) {   // Bucle infinito para lectura y escritura
            try {
                InputStream is = socket.getInputStream(); // Se abre flujo de lectura
                DataInputStream flujo = new DataInputStream(is);
                cliente = flujo.readInt();  // Permanece escuchando hasta que alguno de los clientes le envía un mensaje
                for (int cont = 0; cont < listaCliente.size(); cont++) //Cuando recibe un mensaje, lo replica a todos los Clientes recorriendo el ArrayList de Sockets y escribe al flujo de cada uno de ellos
                {
                    if (listaCliente.get(cont) != socket) {
                        OutputStream os = listaCliente.get(cont).getOutputStream();
                        DataOutputStream flujoDOS = new DataOutputStream(os);
                        flujoDOS.writeInt(cliente);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error de comunicacion" + e);
            }
        }
    }
}
