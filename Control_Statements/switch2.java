
class SwitchDemo {
	public static void main(String[] args){
		char ch = 'a';
		switch(ch) {
			case 'A':
			case 'a':	
				System.out.println("characte A");
				break;
			case 'B':
			case 'b': 	
				System.out.println("Character B");
				break;
			case 'C':
				System.out.println("Character C");
				break;
			default:
				System.out.println("By Default");
				break;
		}
	}
}


