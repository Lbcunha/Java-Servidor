/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.java;

import com.sun.security.ntlm.Client;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciano
 */
public class ClientJava {

    private static ObjectOutputstream ObjectOutputStreamoutput;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      try {
        /*
        1.Estabelecer conexão com o servidor
        2 Trocar mensagens com o servidor        
        */
        //cria conexão entre o cliente e o servidor
        Socket socket= new Socket("localhost", 5555);
        
        //criação dos streams de entrada e saída
        ObjectOutputStreamoutput = new ObjectOutputstream(socket.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(Socket.getInputStream());
      
      }catch (IDException ex){
           Looger.getLooger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    private static class Looger {

        private static Object getLooger(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Looger() {
        }
    }
