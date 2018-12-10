
package shutdown;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ShutDown {

    
    
    public static void main(String[] args) {
        
        try {
            ServerSocket ob = new ServerSocket(1111);
            Socket ob2 = ob.accept();
            
        } catch (IOException ex) {
            Logger.getLogger(ShutDown.class.getName()).log(Level.SEVERE, null, ex);
        }
        Runtime off = Runtime.getRuntime();
        System.out.println("Connected");
    }
    
}
