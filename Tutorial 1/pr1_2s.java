
import java.net.*;
import java.io.*;
import java.io.DataOutputStream;
import java.util.*;

public class Pr1_2s {
    
     public static void main(String args[]) throws Exception  {
     
     while(true){
         ServerSocket s = new ServerSocket(678);
         System.out.println("wait...");
         Socket soc = s.accept();
         Date d = new Date();
        String str = "Date & Time" + d;
        PrintWriter toClient = new PrintWriter(soc.getOutputStream(),true);
        toClient.print(str);
        
     soc.close();
     s.close();
     }
     }
}