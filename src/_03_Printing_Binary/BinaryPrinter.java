package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		System.out.println(printByteBinary((byte)255));
		System.out.println(printShortBinary((Short.MAX_VALUE)));
		System.out.println(printIntBinary((Integer.MAX_VALUE)));
		System.out.println(printLongBinary(Long.MAX_VALUE));
	}
	public static String printByteBinary(byte b) {
		String s = "";
		for (int i = 7; i >= 0; i--) {
			byte b2 = (byte) (b >> i);
			s = s + (b2 & 1);
			
		} 
		boolean b1 = true;
		while(b1) {
			if(s.charAt(0) == '0') {
				s = s.substring(1);
			}
			else {
				b1 = false;
			}
		}
		return s;
	}
	
	public static String printShortBinary(short s1) {
		String s = "";
		for (int i = 15; i >= 0; i--) {
			short b2 = (short) (s1 >> i);
			s = s + (b2 & 1);
			
		} 
		boolean b1 = true;
		while(b1) {
			if(s.charAt(0) == '0') {
				s = s.substring(1);
			}
			else {
				b1 = false;
			}
		}
		return s;
	}
	
	
	public static String printIntBinary(int i2) {
		String s = "";
		for (int i = 31; i >= 0; i--) {
			int b2 = (int) (i2 >> i);
			s = s + (b2 & 1);
			
		} 
		boolean b1 = true;
		while(b1) {
			if(s.charAt(0) == '0') {
				s = s.substring(1);
			}
			else {
				b1 = false;
			}
		}
		return s;
	}	
	public static String printLongBinary(long l) {
		String s = "";
		for (int i = 63; i >= 0; i--) {
			long b2 = (long) (l >> i);
			s = s + (b2 & 1);
			
		} 
		boolean b1 = true;
		while(b1) {
			if(s.charAt(0) == '0') {
				s = s.substring(1);
			}
			else {
				b1 = false;
			}
		}
		return s;
	}
}
