package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 System.out.print("Digite o valor total da compra (R$): ");
	        float valorCompra = scanner.nextFloat();
	        
	        float valorPrestacao = valorCompra / 5;
	        
	        System.out.printf("O valor de cada uma das 5 prestações é: R$ %.2f%n", valorPrestacao);
	        
	        scanner.close();

	}

}
