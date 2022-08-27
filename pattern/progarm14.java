
/* 
  1  2  3  4
  1  2  3
  1  2
  1
*/

class ptr14 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int num = 1;
			for (int j = 4; j >= i; j--) {
				System.out.print(num+" ");
				num = num + 1;
			}
			System.out.println();
		}
	}
}


