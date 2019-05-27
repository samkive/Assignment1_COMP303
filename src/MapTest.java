
public class MapTest {
	
	public static void main(String []args) {
		char[]ArrayChar= {'~','#','G'};
		Map map1 =new Map(10,10);
		  System.out.println("Test case for method SetChar()");
		  for(int row =0;row<9;row++) {
			  for(int width=0;width<9;width++) {
				  for(char chars : ArrayChar) {
					  map1.SetChar(row, width, chars);
					  System.out.print ("arguments: "+row +", "+ width +", "+ chars+" "); 
					  System.out.println("Result : "+map1.GetChar(row, width)); // this print the character in the matrix
				     
				  }
				  
			  }
			  
		  }
	}
	
	
	
	
	
}
