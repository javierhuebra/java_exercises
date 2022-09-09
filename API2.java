import java.util.Scanner;

public class API2 {
	public static void main(String[] args) {
		double a, b, c;
		char letra;
		boolean esEscaleno=false;
		Scanner leer=new Scanner(System.in);
	
		
		do {
			System.out.printf("INGRESE LADO A: ");
			a = leer.nextDouble();
			System.out.printf("INGRESE LADO B: ");
			b = leer.nextDouble();
			System.out.printf("INGRESE LADO C: ");
			c =leer.nextDouble();
		
			if(a!=b && a!=c && b!=c) {
				System.out.printf("EL TRIANGULO ES ESCALENO");
				esEscaleno=true;
			}else {
				System.out.printf("EL TRIANGULO NO ES ESCALENO");
				System.out.println();
				System.out.printf("Desea calcular de nuevo?(Y/N):");
				letra = leer.next().charAt(0);
				System.out.println();
				
				if(letra == 'Y') {
					System.out.printf("Reingrese los valores:");
					System.out.println();
				}else {
					esEscaleno=true;
				}
			}
			
			
		}while(esEscaleno!=true);
		
		
	}
}
