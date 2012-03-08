package lezione2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSimple {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Integer input1;
		Integer input2;
		String somma;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		System.out.println("Inserisci il primo intero....");
		input1 = new Integer(br.readLine());
		System.out.println("Inserisci il secondo intero....");
		input2 = new Integer(br.readLine());
		
		somma = String.valueOf(input1 + input2);
		  
		System.out.println("La somma e'...." + somma);
		
	}

}
