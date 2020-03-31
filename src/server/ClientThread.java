package server;

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
	
	public ClientThread(Socket socket)
	{
		this.setSocket(socket);
	}

	@Override
	public void run()
	{
		// TODO Implement chat
		
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

}
