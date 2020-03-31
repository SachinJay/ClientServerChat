package shared;

public class Constants
{
	public static final int PORT = 4999;
	public static final String HOST_NAME = "localhost";
	
	//*********ERROR MESSAGES********************//
	public static final String SERV_ERR_MSG = "Something went wrong, could not listen on port " + PORT;
	public static final String CLI_IO_ERR_MSG = "Something went wrong, could not connect to port" + PORT;
	public static final String UNKNOWN_HOST_ERR_MSG = "Something went wrong, unknown host: " + HOST_NAME;
	public static final String ACCEP_ERR_MSG = "Something went wrong, could not accept on port " + PORT;
	
}
