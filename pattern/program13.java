/*
  1  2  3  4
  1  2  3
  1  2
  1
*/

class ptr13 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

