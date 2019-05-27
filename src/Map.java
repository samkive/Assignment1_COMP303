
public class Map {
	private int maxRow;
	private int maxWidth;
	private char[][] matrix;

	public Map(int maxRow, int maxWidth) {
		this.maxRow=maxRow;
		this.maxWidth=maxWidth;
		this.matrix = new char[maxRow][maxWidth]; 
			for(int i =0;i<maxRow;i++) {
				for(int j =0;j<maxWidth;j++) {
					this.matrix[i][j]='~'; // Initialize the matrix to the sign '~'
				}
			}
			System.out.println("Map has been created.");
	}
	
	public void SetChar(int row, int width, char newChar) { // method to call to change a character in the matrix
		matrix[row][width]=newChar;
		
	}
	public char GetChar(int row ,int width) { // This is to check if the setChar method work
		
		return matrix[row][width];
	}
	
	public void printMatrix() { // method to print the matrix at the end
		for (int i =0;i<this.maxRow;i++) {
			for(int j=0;j<this.maxWidth;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	
}
