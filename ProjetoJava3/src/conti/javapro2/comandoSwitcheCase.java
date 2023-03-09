package conti.javapro2;

public class comandoSwitcheCase {
	public static void main (String[] args) {
		int media = 80;
		/* testando o comando switch*/
		int dia = 1;
		/*por padrão o comando Switch, vem da seguinte forma,
		  onde key é a variavel a ser checadam e em "value" é o valor onde quer chegar
		  logo em seguida você diz o que deve ser feito, geralmente sysout.
		  em default é como se fosse um "se não" segue exemplo. podem ser adicionados 
		  mais casos
		switch (key) {
		case value:
			
			break;

		default:
			break;
		}*/
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		/* case 2:
		   sysout.
		  break;*/

		default:System.out.println("outro dia qualquer");
			break;
		}
		
		
	}

}
