package patternPrograms;

public class Pattern2 {
	
/*	
	1 
	1 2 
	1 2 3 
	1 2 
	1 
*/	

	public static void main(String[] args) {
		int line = 5;
		int star = 1;
		for (int i = 1; i <= line; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			if(i < ((line+1)/2))
			star++;
			else
				star--;
		}

	}

}
