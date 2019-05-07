import java.io.*;
import java.net.*;
import java.util.Scanner;
public class server{
public static Socket socket;
public static void main(String args[])throws IOException
{
int port=8080;
String answer;String returnmsg;String reply;
Scanner obj=new Scanner(System.in);
ServerSocket server=new ServerSocket(port);
System.out.println("Server starts at port " + port);
while(true)
{
socket=server.accept();
InputStream is=socket.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br=new BufferedReader(isr);
answer=br.readLine();
if("NET3202".equals(answer)||"net3202".equals(answer)||"NET 3202".equals(answer))
{
reply="correct";
returnmsg=reply;
}
else
{
reply="wrong";
returnmsg=reply;
}
OutputStream os=socket.getOutputStream();
OutputStreamWriter osw=new OutputStreamWriter(os);
BufferedWriter bw=new BufferedWriter(osw);
bw.write(returnmsg);
bw.newLine();
System.out.println("Message Replied to client:" + returnmsg);
bw.flush();
}}}

