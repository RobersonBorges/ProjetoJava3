package conti.javapro2;

public class estruturaWhile {
	public static void main (String[] args) {
		/* repete enquanto uma condição for verdadeira*/
		int numero = 0;
		while(true) {
			System.out.println(numero);
			numero++;
		if (numero > 10) {
			break;
		}
		}
		int numero2 = 0;
		do {/* o comando "DO WHILE" primeiro executa depois faz a verificação*/
			System.out.println("o numero atual e: " +numero2);
			numero2++;
		}while (numero2 <=60);
	}

}
