package day0809;
import java.util.*;
import java.util.Scanner;

public class SingleProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		
		
		
		while(pos.getIsRun()) {
			int number = pos.printMenu();
			switch(number) {
				case 1:{
					pos.inserMenu();
				}break;
				case 2:{
					pos.reupdateDrinkUnit();
				}break;
				case 3:{
					pos.viewMenu();
				}break;
				case 4:{
					pos.deleteMenu();
				}break;
				case 5:{
					pos.searchDrinUnit();
				}default:
					pos.setIsRun(false);
			}

		}
	
	
	
	
	
	
	
	
	
	}

}
