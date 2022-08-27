/*
   1 
   B  C
   4  5  6  
   G  H  I  J
   11 12 13 14 15
*/

class ptr17 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%2 != 0) {
					System.out.print(num+" ");
					num = num + 1;
				}else{
					System.out.print((char)(64+num) +  " " );
					num = num + 1;
				}
			}
			System.out.println();
		}
	}
}


