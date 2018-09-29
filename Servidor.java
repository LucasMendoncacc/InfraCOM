import java.io.DataInputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

	public static void main(String[] args) {
		int port = 2020;
		
		try {
			ServerSocket tmpsocket = new ServerSocket(port);
	
			 while (true) {
				System.out.println("Aguardando cliente...");
				Socket socket = tmpsocket.accept ();
				DataInputStream entrada = new DataInputStream(socket.getInputStream());
				String recebido = "";
				recebido = entrada.readUTF();
				
				
				long a= java.lang.System.currentTimeMillis();
				long b= a+10000;
				
				
				 if (recebido!="") {
					while(a<=b) {
						System.out.println(recebido);
						recebido = entrada.readUTF();
						a=java.lang.System.currentTimeMillis();
					}
				 }
			 }
			 
			 
		} catch (BindException e) {
			System.out.println("Endereço em uso");
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}

}