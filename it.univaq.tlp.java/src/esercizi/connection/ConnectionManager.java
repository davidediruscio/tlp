package esercizi.connection;

public class ConnectionManager {

	private static Connection[] connections = {new Connection("Conn1"), new Connection("Conn2"), new Connection("Conn3")};
	private static int availableConnections = connections.length;
	private static ConnectionManager instance = new ConnectionManager();

	private ConnectionManager(){
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


