/* 
            1
	4   1
    9   4   1
16  9   4   1 

*/

class ptr22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int num = i;
			for (int j = 4; j >= i; j--) {
				System.out.print("   ");
			}
			for (int p = 1; p <= i; p++) {
				System.out.print(num * num + "  ");
				num = num - 1;
			}
			System.out.println();
		}
	}
	
}

