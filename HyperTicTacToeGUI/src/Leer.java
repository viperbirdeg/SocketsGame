/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.net.*;
import java.io.*;

class Leer extends Thread // Creamos Hilo heredando de la clase Thread
{

    Socket socket;
    int cambio;
    
    Leer(Socket socket,int cambio) // Recibe un objeto Socket para indicar qué Socket esta ligado a este proceso
    {
        this.socket = socket;
        start();   //Iniciar el proceso
    }

    public void run() {
        try {
            while (true) {     //bucle infinito para lectura
                InputStream aux = socket.getInputStream();
                DataInputStream flujo = new DataInputStream(aux);
                cambio = flujo.readInt();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
