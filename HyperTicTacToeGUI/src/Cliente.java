
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Cliente {

    Scanner entrada;
    int cambio;
    
    Cliente(int cambio) {
        this.cambio = cambio;
        try {
            Socket skCliente = new Socket("localhost", 5000);
            Leer hilo2 = new Leer(skCliente,cambio);    //hilo que lee, se envía como parámetro el Socket				   skCliente.close();         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Enviar(int posicion) throws IOException{
        Socket skCliente = new Socket("localhost", 5000);
        OutputStream os = skCliente.getOutputStream();
        DataOutputStream flujoDOS = new DataOutputStream(os);
        flujoDOS.writeInt(posicion);
    }
}