package conditional;

public class Conditional2 {
	public static void main(String[] args) {
		System.out.println("Testing conditional\n");

		int age = 17;
		int numberOfPeople = 3;
		boolean accompanied = numberOfPeople >= 2;

		System.out.println("Value of accompanied = " + accompanied);
		if (age >= 18 || accompanied) { // '||' => Caso alguma condição seja verdadeira executa '&&' => Todas as condições precisam ser verdadeiras
			System.out.println("Welcome!");
		} else {
			System.out.println("You can't enter");
		}
	}
}
