package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import shared.Constants;

public class Server
{
	protected static ArrayList<ClientThread> clients;
	
	public static void main(String[] args) 
	{
		//socket that the server connects to, same as the socket
		//the client connects to
		ServerSocket serverSocket = null;
		try
		{
			serverSocket = new ServerSocket(Constants.PORT);
			acceptClients(serverSocket);
		} 
		catch (IOException e)
		{
			System.out.println(Constants.SERV_ERR_MSG);
			e.printStackTrace();
		}
		
		
		
		//When Client.java is run, it will connect to the server 
		//socket above, this below line waits and listens for this event
		//to occur
		//Socket socket = serverSocket.accept();
		
//		//Will only print when the client connects
//		System.out.println("Client Connected");
//		
//		//Input stream comes from the accepted socket
//		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
//		
//		BufferedReader reader = new BufferedReader(isr);
//		String message = reader.readLine();
//		System.out.println("client said: " + message);
//		
//		PrintWriter pr = new PrintWriter(socket.getOutputStream());
//		pr.println("This is a test message from the server");
//		pr.flush();
	
	}
	
	public static void acceptClients(ServerSocket serverSocket)
	{
		clients = new ArrayList<>();
		while(true)
		{
			try
			{
				// Listens for connections on this port and accepts them when connected
				// After acceptance, creates and returns new socket
				Socket socket = serverSocket.accept();
				ClientThread clientThread = new ClientThread(socket);
				
				//Can take in clientThread because clientThread is runnable
				Thread thread = new Thread(clientThread);
				thread.start();
			
				clients.add(clientThread);
			} 
			catch (IOException e)
			{
				System.out.println(Constants.ACCEP_ERR_MSG);
				e.printStackTrace();
			}
		}
		
	}


}
