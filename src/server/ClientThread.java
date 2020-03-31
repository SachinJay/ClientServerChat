package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Class to represent a client thread, server will need to keep track of many client threads
 * @author Sachin Devasahayam
 *
 */
public class ClientThread extends Server implements Runnable
{
	/**
	 * The socket returned when server accepts a client
	 */
	private Socket socket; 
	
	//For reading and writing
	private BufferedReader reader; 
	private PrintWriter writer;
	
	public ClientThread(Socket socket)
	{
		this.setSocket(socket);
	}

	@Override
	public void run()
	{
		// TODO Implement chat using writer and reader
		
		//Where do we read and write from and to? The socket's streams
		InputStream in;
		try
		{
			in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			//Just as had been done in the previosu project
			InputStreamReader isr = new InputStreamReader(in);
			reader = new BufferedReader(isr);
			
			//While the socket is still open (i.e. there is a person there chatting)
			while(!socket.isClosed())
			{
				String chat = reader.readLine();
				if(chat != null)
				{
					for(ClientThread client : clients)
					{
						client.getWriter().write(chat);
					}
				}
			}
			
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
		
	}

	/**
	 * @return the socket
	 */
	public Socket getSocket()
	{
		return socket;
	}

	/**
	 * @param socket the socket to set
	 */
	public void setSocket(Socket socket)
	{
		this.socket = socket;
	}

	/**
	 * @return the writer
	 */
	public PrintWriter getWriter()
	{
		return writer;
	}

	/**
	 * @param writer the writer to set
	 */
	public void setWriter(PrintWriter writer)
	{
		this.writer = writer;
	}

}
