import java.util.Scanner;

public class CalcularFiguras {
	static double calcularPerimetro(int selector) {
		Scanner leer=new Scanner(System.in);
		
		double cuenta;
		double ladoCuadrado,ladoA,ladoB, radio;
		cuenta=1;
		
		switch(selector) {
		case 1: 
			System.out.println("Ingrese longitud de lados del cuadrado: ");
			ladoCuadrado =leer.nextDouble();
			cuenta=ladoCuadrado*4;
			
			break;
		
		case 2:
			System.out.println("Ingrese lado A del rectangulo: ");
			ladoA =leer.nextDouble();
			System.out.println("Ingrese lado B del rectangulo: ");
			ladoB =leer.nextDouble();
			cuenta=(ladoA*2)+(ladoB*2);
			
			break;
		
		case 3:
			System.out.println("Ingrese radio del circulo: ");
			radio =leer.nextDouble();
			cuenta=radio*3.14;
			
			break;
		
		
		default:
			System.out.println("VALOR NO VALIDO");
		}
		return cuenta;
	}
	
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int valor;
		double variableTemporal;
		System.out.println("**CALCULADORA DE PERIMETROS**");
		System.out.println("1 - Cuadrado");
		System.out.println("2 - Rectangulo");
		System.out.println("3 - Circulo");
		System.out.printf("Ingrese valor:");
		valor =leer.nextInt();
		
		if(valor==1) {
			variableTemporal=calcularPerimetro(valor);
			System.out.printf("El perimetro del cuadrado es:");
			System.out.println(variableTemporal);
			variableTemporal=calcularPerimetro(2);
			System.out.printf("El perimetro del rectangulo es:");
			System.out.println(variableTemporal);
			variableTemporal=calcularPerimetro(3);
			System.out.printf("El perimetro del circulo es:");
			System.out.println(variableTemporal);
		}else if(valor==2) {
			variableTemporal=calcularPerimetro(valor);
			System.out.printf("El perimetro del rectangulo es:");
			System.out.println(variableTemporal);
			variableTemporal=calcularPerimetro(1);
			System.out.printf("El perimetro del cuadradoo es:");
			System.out.println(variableTemporal);
			variableTemporal=calcularPerimetro(3);
			System.out.printf("El perimetro del circulo es:");
			System.out.println(variableTemporal);
		}else if(valor==3) {
			variableTemporal=calcularPerimetro(valor);
			System.out.printf("El perimetro del circulo es:");
			System.out.println(variableTemporal);
			variableTemporal=calcularPerimetro(1);
			System.out.printf("El perimetro del cuadrado es:");
			System.out.println(variableTemporal);
			variableTemporal=calcularPerimetro(2);
			System.out.printf("El perimetro del rectangulo es:");
			System.out.println(variableTemporal);
		}
		
		
	}
}
