/* 
  1  2  3
  4  5  6 
  7  8  9
  */


class ptr2 {
	public static void main(String[] args ) {
		int num = 1;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(num+" ");
				num = num + 1;
			}
			System.out.println();
		}
	}
}

