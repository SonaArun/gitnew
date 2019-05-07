import java.io.*;
import java.net.*;
import java.util.Scanner;
public class client{
public static void main(String args[])throws IOException
{
Scanner obj=new Scanner(System.in);
int port=8080;
String answer;String Sendmessage;String Receivedmessage;
String host=null;
InetAddress address=InetAddress.getByName(host);
Socket socket=new Socket(address,port);
OutputStream os=socket.getOutputStream();
OutputStreamWriter osw=new OutputStreamWriter(os);
BufferedWriter bw=new BufferedWriter(osw);
System.out.println("Please answer the following question?");
System.out.println("What is the subject code for socket programming");
answer=obj.nextLine();
Sendmessage=answer;
bw.write(Sendmessage);
bw.newLine();
bw.flush();
System.out.println("Message send to server = " + Sendmessage);
InputStream is=socket.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br=new BufferedReader(isr);
Receivedmessage=br.readLine();
System.out.println("MessageReceived from Server="+ Receivedmessage);
}
}

