package esercizi.connection;


public class ConnectionManager2 {

	
	private static int availableConnections = 3;
	private static ConnectionManager2 instance = new ConnectionManager2();
	private static Connection[] connections;

	private ConnectionManager2(){
		connections =new Connection[]{new Connection("Conn1"), new Connection("Conn2"), new Connection("Conn3")};
	}
	
	public static ConnectionManager2 getInstance(){
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


