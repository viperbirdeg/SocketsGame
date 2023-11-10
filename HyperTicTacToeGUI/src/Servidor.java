
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author victo
 */
public class Servidor {

    AtiendeClientes cte;	// Objeto para hacer uso del proceso de lectura y escritura
    ArrayList<Socket> listaCliente = new ArrayList();

    public Servidor() {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket cliente;
            System.out.println("Servidor iniciado");
            while (true) {
                cliente = ss.accept();
                System.out.println("Conexión exitosa");
                listaCliente.add(cliente);
                cte = new AtiendeClientes(listaCliente, cliente);
                enviarTurno(cliente);
            }
            //ss.close();        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Servidor();
    }

    private void enviarTurno(Socket sc) throws IOException {
        OutputStream os = sc.getOutputStream();
        DataOutputStream flujoDOS = new DataOutputStream(os);
        int f = 1;
        System.out.println(listaCliente.size());
        if (listaCliente.size() == 1) {
            f = 100;
        } else if (listaCliente.size() == 2) {
            f = 101;
        } else {
            f = 999;
        }
        flujoDOS.writeInt(f);
        System.out.println(f);

    }
}
