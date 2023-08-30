package interFace;


	
	class SPrinterDriver implements Printable {
		
		public void Print(String doc) {
			System.out.println("From Samsung printer");
			System.out.println(doc);
		}
		public void insert(String doc) {
			System.out.println(doc);
		}

	}
	
	class LPrinterDriver implements Printable {
		
		public void Print(String doc) {
			System.out.println("From LG printer");
			System.out.println(doc);
		}

	}
	
	


