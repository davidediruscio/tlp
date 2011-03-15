package lezione3;

class ConvMethod {
	static int m(byte a, byte b) { 
		System.out.println("Sono m(byte,byte) ");
		return a+b; 	
	}
	
	static int m(short a, short b) { 
		System.out.println("Sono m(short,short) ");
		return a-b; 
		
	}
	
	static long m(int a, int b) { 	
		System.out.println("Sono m(int,int) ");
		return a-b; 
		
	}

	public static void main(String[] args) {
		long i=12;
		long j=2;
		System.out.println(m((int)i,(int) j));
		//short s3 = 0x1ffff; 
	}
}
