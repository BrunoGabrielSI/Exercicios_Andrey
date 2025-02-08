package exercicio_2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência (em cm): ");
        double raio = scanner.nextDouble();

        double pi = 3.14;
        double area = pi * raio * raio;
        double perimetro = 2 * pi * raio;

        System.out.printf("A área é %.2f cm²%n", area);
        System.out.printf("O perímetro é %.2f cm%n", perimetro);

        scanner.close();
    }
}
