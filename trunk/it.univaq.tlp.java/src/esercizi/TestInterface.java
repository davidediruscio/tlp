package esercizi;

interface MyInterface {
	int i=1;
}

public class TestInterface implements MyInterface{
	
	
	public static void main(String[] args){
		System.out.println(MyInterface.i);
	}

}
