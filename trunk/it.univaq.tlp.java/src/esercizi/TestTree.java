package esercizi;

public class TestTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Node (new Node(new Leaf("a"), new Leaf("bb")), new Leaf("c"));
		
		System.out.println(t.in("a"));
		System.out.println(t.maxLength());

	}

}
