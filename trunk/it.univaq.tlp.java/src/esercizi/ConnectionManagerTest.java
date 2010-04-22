package esercizi;

import esercizi.connection.Connection;
import esercizi.connection.ConnectionManager;
import esercizi.connection.ConnectionManager2;

public class ConnectionManagerTest {

	public static void main(String[] args) {
		
		// Connection c = new Connection("conn");
		/*
		Connection conn1 = ConnectionManager.getConnection();
		Connection conn2 = ConnectionManager.getConnection();
		Connection conn3 = ConnectionManager.getConnection();
		Connection conn4 = ConnectionManager.getConnection();
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
		System.out.println(conn4);
		*/
		Connection conn12 = ConnectionManager2.getConnection();
		Connection conn22 = ConnectionManager2.getConnection();
		Connection conn32 = ConnectionManager2.getConnection();
		Connection conn42 = ConnectionManager2.getConnection();
		
		System.out.println(conn12);
		System.out.println(conn22);
		System.out.println(conn32);
		System.out.println(conn42);
		
	}
}