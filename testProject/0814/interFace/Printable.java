package interFace;


	interface Printable {
		void Print(String doc);
		
		
		static void printLine(String str) {
			System.out.println("스태틱 메서드");
		}
		
		default void printCMYK(String doc) {
			System.out.println("디폴트메서드");
			printLine(doc);
			
		}
	}
	
