package client;

import java.net.Socket;

public class ServerThread implements Runnable
{
	/**
	 * The socket related to this client
	 */
	private Socket socket; 
	
	public ServerThread(Socket socket)
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
