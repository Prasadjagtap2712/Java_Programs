/*
 A B C 
 D E F 
 G H I
 */


class ptr3 {
	public static void main(String[] args) {
		int ch = 65;
		for (int row= 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
		               
				System.out.print((char)ch + " ");
			        ch = ch + 1; 
			}
			System.out.println();
		}
	}
}

