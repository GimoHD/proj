import java.io.*;
import java.net.*;
import org.json.*;


//uit : de java turorial
//http://docs.oracle.com/javase/tutorial/networking/sockets/readingWriting.html

public class Client {
    JsonCreate Json = new JsonCreate();
    Socket echoSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;

    String host = "192.168.0.100"; // drie mogelijkheden


    public static void main(String[] args) throws IOException {



        Json.makeJson();
        try {
            echoSocket = new Socket(host, 4020); // pc-naam of ip-adres + poort

            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in  = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream()));
        } 
        catch (UnknownHostException e) {
            System.err.println("Don't know about host" + host);
            System.exit(1); // kan beter met booleans ...enz
        }
        catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + host);
            System.exit(1);
        }
        // JSON start
        
        String userInput;
        String serverReply;
        boolean gedaan = false;
            ; // zend ingetikte tekst naar server

      // while (!gedaan) {
            //out.println(userInput); // zend ingetikte tekst naar server
            //Json.outerObject.toString().toCharArray()
            out.println(Json.innerObject.toString().toCharArray());
            serverReply = in.readLine();
            System.out.println("echo: " + serverReply);
            if (serverReply.equals("EINDE")) {
                gedaan = true;
            }
        //}

        out.close();
        in.close();
        toetsenbord.close();
        echoSocket.close();
    }
    
 
    
}