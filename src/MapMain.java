import java.util.Scanner;

public class MapMain {
	
	
	
	public static void main(String []args) {
		System.out.println("Welcome to Map!");
		char valid = 'Y'; // Initialize the loop with Yes 
		Scanner sc = new Scanner(System.in);
		
		int row;
		int column;
		
				while(true) { 
					System.out.print("Please input the maximum number of rows: ");
					String input = sc.next();
					
					try {
						 row = Integer.parseInt(input);
						 if(row<=0) {
							 throw new IllegalArgumentException();
						 }
						 break;
					}catch(Exception e) {
						System.out.println("A row must be greater than 0.");
					}
				}
		
				while(true) {
					System.out.print("Please input the maximum number of columns: ");
					String input1 = sc.next();
					
					try {
						 column = Integer.parseInt(input1);
						 if(column<=0) {
							 throw new IllegalArgumentException();
						 }
						 break;
					}catch(Exception e) {
						System.out.println("A column must be greater than 0.");
					}
				}
				
				
				Map Map1=new Map(row,column);
				
				while(valid=='Y') { // We begin the loop to draw the map here
				
				System.out.println("Please add an object to the map (~ for water, G for grass, # for tree)");
				
				System.out.print("Row: ");
				int objRow=sc.nextInt();
				while(objRow<0 || objRow >=row) {
					int maxRow=row-1;
					System.out.println("Invalid row! It must be between 0 and "+ maxRow  +".");
					System.out.print("Row: ");
					objRow=sc.nextInt();
				}
				System.out.print("Column: ");
				int objCol=sc.nextInt();
				while(objCol<0 || objCol >=column) {
					int maxCol=column-1;
					System.out.println("Invalid column! It must be between 0 and "+ maxCol  +".");
					System.out.print("Column: ");
					objCol=sc.nextInt();
				}
				
				System.out.print("Character: ");
				char character =sc.next().charAt(0); 
				while(character != '~' && character!='G' && character!= '#') {
					System.out.println("Invalid character! It must be either ~ or G or #.");
					System.out.print("Character: ");
					character=sc.next().charAt(0); 
				}
				
				
				Map1.SetChar(objRow ,objCol, character);
				System.out.println("Your " + character+ " has been added to " + objRow +"," + objCol + " in the map");
				
				System.out.print("Would you like to enter another character (Y/N):");
				valid=sc.next().charAt(0);	
				if(valid!='Y') {
					Map1.printMatrix();
					break;
				}
		}
			
			
		
	}
	
	
}
