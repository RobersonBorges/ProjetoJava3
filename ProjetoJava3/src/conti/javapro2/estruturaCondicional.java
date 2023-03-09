package conti.javapro2;

import java.util.Scanner;

public class estruturaCondicional {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("****** SISTEMA DE CALCULO DE  MEDIA ALUNOS *******");
		/* solicitando  notas*/
		System.out.println("digite a primeira nota: ");
		int nota1 = scanner.nextInt();
		System.out.println("digite a segunda nota: ");
		int nota2 = scanner.nextInt();
		System.out.println("digite a terceira nota: ");
		int nota3 = scanner.nextInt();
		double mediaFinal = (nota1+nota2+nota3)/3;
		/*estipulando condições*/
		if (mediaFinal >= 7){
			System.out.println("você está aprovado, e sua media e: " + mediaFinal);						
	}	
		else {
		if(mediaFinal < 7 && mediaFinal >= 5) {
		System.out.println("voce esta de recuperacao e sua media e: " +mediaFinal);}
		else {
			System.out.println("voce esta reprovado e sua media e: " +mediaFinal);
		}
		}
		}
}

