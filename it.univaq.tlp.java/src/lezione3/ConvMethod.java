package lezione3;

class ConvMethod {
	static int m(byte a, byte b) { return a+b; }
	static int m(short a, short b) { return a-b; }
	static long m(long a, long b) { return a-b; }

	public static void main(String[] args) {
		int i=12;
		int j=2;
		System.out.println(m(i, j));
		//short s3 = 0x1ffff; 
	}
}
