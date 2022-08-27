
/*
   1   4   9
   16  25  36
   49  64  81
*/

class prg5 {
	public static void main(String[] args)  {
		int num = 1;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++ ) {
				System.out.print(num*num+"   ");
				num = num + 1;
			}
			System.out.println();
		}
                System.out.println();
	}
}

