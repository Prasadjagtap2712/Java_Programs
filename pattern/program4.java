
/* 
   A  b  C
   d  E  f
   G  h  I
*/

class prg4 {
	public static void main(String[] args) {
		int vari = 65;
		int vari1; 
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				if (col%2 != 0 ) {
					System.out.print((char)vari +" ");
					vari = vari + 1;
				}else{
					vari = vari + 32;
					System.out.print((char)vari+" ");
					vari = vari - 32;
					vari = vari + 1;
				}
			}
			System.out.println();
		}
	}
}


