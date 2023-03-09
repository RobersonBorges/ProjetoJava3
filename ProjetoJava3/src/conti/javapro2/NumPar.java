package conti.javapro2;
import java.util.Scanner;
public class NumPar {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int numero = scanner.nextInt();
		if (numero %2 == 0) {
			System.out.println("o numero digitado é par.");
		}else {
			System.out.println("o numero digitado é impar.");
		}
	}

}
