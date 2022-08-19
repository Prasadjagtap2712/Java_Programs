 class plan {
	 public static void main (String[] args){
		 System.out.println("1.Movie");
		 System.out.println("2.Cafe");
		 int choice = 3;
		 switch(choice) {
			 case 1:
			 	System.out.println("1.Pushpa");
			 	System.out.println("2.Movie 83");
			 	int ch1 = 1;
			 	switch(ch1){ 
				 	case 1 :
					 	System.out.println("Pushapa");
					 	break;

				 	case 2:
						System.out.println("83");
			       			break;
				 	default:
						System.out.println("Tadap");
		       				break;
				}
			 case 2:
				System.out.println("1.Cafe CO2");
				System.out.println("2.Cafe CID");
				int ch2 = 1;
				switch(ch2) {
						case 1:
							System.out.println("CO2");
							break;
						case 2:
							System.out.println("CID");
							break;
						default:
							System.out.println("Hotel");
							break;
				}
			  default:
				   System.out.println("Gaadi Nahiyr");
			           break;	   

			 }
			 
		 
		 }
	 }


