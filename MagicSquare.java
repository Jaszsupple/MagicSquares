
public class MagicSquare {

	public static void main(String[] args) {

		int rows =0;
		int column= 0;
		int sum = 0;
		int magicssquare [] [] = {{4,9,2}, {3,5,7}, {8,1,6}};

		//Test code fot the magicsquare concept
		for ( rows = 0; rows < 3; rows++) {
			for(column= 0; column < 3; column++) {
				System.out.print(magicssquare[rows][column] + "\t" );
				if ((rows == column) || (column + rows == 2)) {
					sum += magicssquare[rows][column];
				}				
				if ((column + rows == 0) || (column + rows == 1) || (column + rows==2)) {
					sum += magicssquare[rows][column];
				}
				if ((column + rows == 1) || (column + rows == 2) || (column + rows==3)) {
					sum += magicssquare[rows][column];
				}
				if ((column + rows == 2) || (column + rows == 3) || (column + rows==4)) {
					sum += magicssquare[rows][column];
				}
			}		
			System.out.println(" ");	

		}

		//Conditional statement for outputing the right results
		if (sum == 120) {
			System.out.println("This is a magic Square");
		} else System.out.println("This is not a magic Square");

	}

}
