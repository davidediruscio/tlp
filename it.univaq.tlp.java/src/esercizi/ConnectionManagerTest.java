package esercizi;

import esercizi.connection.Connection;
import esercizi.connection.ConnectionManager;

public class ConnectionManagerTest {

	public static void main(String[] args) {
		
		// Connection c = new Connection("conn");
		
		Connection conn1 = ConnectionManager.getConnection();
		Connection conn2 = ConnectionManager.getConnection();
		Connection conn3 = ConnectionManager.getConnection();
		Connection conn4 = ConnectionManager.getConnection();
		
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
		System.out.println(conn4);
		
	}
}