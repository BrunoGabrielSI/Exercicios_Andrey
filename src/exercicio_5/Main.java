package exercicio_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        Scanner scanner = new Scanner(System.in);
        int tentativasRestantes = 10;

        System.out.println("Tente adivinhar o número entre 0 e 100.");

        while (tentativasRestantes > 0) {
            System.out.print("Tentativas restantes: " + tentativasRestantes + ". Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }

            tentativasRestantes--;
        }

        if (tentativasRestantes == 0) {
            System.out.println("Suas tentativas acabaram. O número era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}