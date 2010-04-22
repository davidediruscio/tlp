package esercizi.connection;


public class ConnectionManager {

	
	private static int availableConnections = 3;
	private static ConnectionManager instance = new ConnectionManager();
	private static Connection[] connections ;

	private ConnectionManager(){
		connections =new Connection[]{new Connection("Conn1"), new Connection("Conn2"), new Connection("Conn3")};
	}
	
	public static ConnectionManager getInstance(){
		return instance;
	}
	
	public static Connection getConnection(){
		if (availableConnections == 0) 
			return null;
		else {
			availableConnections--;
			return connections[availableConnections];
		}
	}

}


