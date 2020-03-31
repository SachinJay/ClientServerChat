package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import shared.Constants;

public class Client
{
	public static void main(String[] args)
	{
		//Socket that client connects to
		Socket socket = null;
		try
		{
			socket = new Socket(Constants.HOST_NAME, Constants.PORT);
			
			//TODO why?
			Thread.sleep(1000);
			
			ServerThread serverThread = new ServerThread(socket);
			Thread thread = new Thread(serverThread);
			thread.start();
		}
		catch (UnknownHostException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println(Constants.SERV_ERR_MSG);
			e.printStackTrace();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		PrintWriter pr = new PrintWriter(socket.getOutputStream());
//		pr.println("This a test message from the client");
//		pr.flush();
//		
//		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
//		
//		BufferedReader reader = new BufferedReader(isr);
//		String message = reader.readLine();
//		System.out.println("Server said: " + message);
	}
}
