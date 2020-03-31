package client;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable
{
	/**
	 * The socket related to this client
	 */
	private Socket socket; 
	
	private String userName;
	private BufferedReader serverReader;
	private BufferedReader userReader;
	private PrintWriter writer;
	
	public ServerThread(Socket socket, String name)
	{
		this.setSocket(socket);
		this.setUserName(name);
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

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * @return the serverReader
	 */
	public BufferedReader getServerReader()
	{
		return serverReader;
	}

	/**
	 * @param serverReader the serverReader to set
	 */
	public void setServerReader(BufferedReader serverReader)
	{
		this.serverReader = serverReader;
	}

	/**
	 * @return the userReader
	 */
	public BufferedReader getUserReader()
	{
		return userReader;
	}

	/**
	 * @param userReader the userReader to set
	 */
	public void setUserReader(BufferedReader userReader)
	{
		this.userReader = userReader;
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
