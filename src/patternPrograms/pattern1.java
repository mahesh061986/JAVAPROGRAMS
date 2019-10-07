package patternPrograms;

public class pattern1 {

/*	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
*/
	public static void main(String[] args) {

		int line = 5;
		int star = 1;
		for (int i = 0; i < line; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			star++;
		}

	}

}
