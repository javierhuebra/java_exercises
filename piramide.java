
public class piramide {

	public static void main(String[] args) {
		int i, j, row=10;
		
		for(i=0;i<row;i++) {
			
			for(j=row-i;j>1;j--) {
				System.out.printf(" ");
			}
			
			for(j=0;j<=i;j++) {
				System.out.printf("* ");
			}
		
		System.out.println();	
		}

	}

}
