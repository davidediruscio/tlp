package esercizi;

import esercizi.connection.Connection;
import esercizi.connection.ConnectionManager;

public class ConnectionManagerTest {

	public static void main(String[] args) {
		ConnectionManager cm = ConnectionManager.getInstance();
		

		Connection conn1 = cm.getConnection();
		Connection conn2 = cm.getConnection();
		Connection conn3 = cm.getConnection();
		Connection conn4 = cm.getConnection();
		
		
		System.out.println(conn3);
		System.out.println(conn4);
		
	}
}