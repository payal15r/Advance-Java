
import java.io.*;
import java.net.*;
import java.lung.*;

public class Pr1_2c {
    
    public static void main(String args[]) throws Exception {
        
        Socket soc = new Socket("localhost",678);
         BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
         System.out.println(in.readLine());
         in.close();
         soc.close();
    }
    
    
}
