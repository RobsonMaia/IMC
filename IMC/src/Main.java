import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double massa, altura, imc;

		System.out.println("----------------------------");
		System.out.println("----- CALCULANDO O IMC -----");
		System.out.println("----------------------------");
		System.out.print("Informe sua MASSA (kg): ");
		massa = leia.nextDouble();
		System.out.print("Informe sua ALTURA (m): ");
		altura = leia.nextDouble();
		System.out.println("----------------------------");
		imc = massa / (Math.pow(altura, 2.0));
		System.out.printf("IMC: " + "%.2f%n", imc);
		if (imc < 17) {
			System.out.println("Você está MUITO ABAIXO do peso ideal");
		} else if (imc >= 17 && imc < 18.5) {
			System.out.println("Você esta ABAIXO do peso ideal");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Parabens você está no peso ideal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Você está com SOBREPESO");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Você está com OBESIDADE");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Você está com OBESIDADE SEVERA");
		} else if (imc >= 40) {
			System.out.println("Você está com OBESIDADE MÓRBIDA");
		}
		imc = leia.nextDouble();

		leia.close();
	}
}