class mall {
	int cashcounter = 0;  // Non-static variable (Instance-Variable)
	static int parking = 1; //Static variable

	//Static method
	static void cleaning() {
		System.out.println("Mall Cleaning");
	}

	//Non-Static Method
	void prodDisplay() {
	       System.out.println("Attractive Display");
	}

	public static void main(String[] args) {
		System.out.println(parking);
		cleaning();
		
		mall obj = new mall();

		System.out.println(obj.cashcounter);
		obj.prodDisplay();
		obj.cleaning();

		mall obj2 = new mall();
		System.out.println(obj2.cashcounter);
		obj2.prodDisplay();

	}
}


		
