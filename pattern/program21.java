
/*
           1
	2  1
    3   2  1
4   3   2  1
*/

class ptr21 {
	public static void main(String[] args)  {
		for (int i = 1; i <= 4; i++)  {
			int num = i;
			for (int j = 4; j >= i; j--) {
				System.out.print("  ");
			}
			for (int p = 1; p <= i; p++) {
				System.out.print(num + " ");
				num = num - 1;
			}
			System.out.println();

		}
	}
}

	
