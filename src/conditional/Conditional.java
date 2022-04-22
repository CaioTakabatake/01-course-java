package conditional;

public class Conditional {
	public static void main(String[] args) {
		System.out.println("Testing conditional\n");

		int age = 17;
		int numberOfPeople = 3;

		if (age >= 18) {
			System.out.println("Maior de 18 anos\nSeja bem vindo!");
		} else {
			if (numberOfPeople >= 2) {
				System.out.println("Você é menor de idade, mas pode entrar porquê está acompanhado de " + numberOfPeople
						+ " pessoas \nSeja bem vindo!");
			} else {
				System.out.println("Você é menor de idade \nInfelizmente você não pode entrar!");
			}
		}
	}
}
