/* 
   1 
   A  B
   2  3  4
   C  D  E  F

*/

class ptr16 {
	public static void main(String[] args) {
		int num = 1;
		int ch = 65;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%2 != 0) {
					System.out.print(num+" ");
					num = num + 1;
				}else{
					System.out.print((char)ch + " ");
					ch = ch + 1;

				}
			}
			System.out.println();
		}
	}
}

	
