
/* 
           A
	A  B
     A  B  C
  A  B  C  D

*/

class ptr20 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int ch = 65;
			for(int j = 4; j >= i; j--) {
				System.out.print("  ");
			}
			for (int p = 1; p <= i; p++) {
				System.out.print((char)ch + " ");
				ch = ch + 1;
			}
			System.out.println();
		}
		System.out.println();
	}
}





