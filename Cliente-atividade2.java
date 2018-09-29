import java.io.DataOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		int port = 2020;
		String address = "localhost";
		Scanner in = new Scanner(System.in);
		
		try {
			Socket socket = new Socket(address,port);
			//troca de dados
			
			String pacote = "";
			DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
			while(true) {
				pacote = in.nextLine();
				saida.writeUTF(pacote);
			}
			
			
		
		} catch (ConnectException e) {
			System.out.println("Não foi possível ao destino");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
