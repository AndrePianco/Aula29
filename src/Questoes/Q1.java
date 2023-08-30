package Questoes;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S1 = null;
        String S2 = null;
        char choice = 'm';
        while(choice != 'f'){
            System.out.printf("Menu Do Programa:\nDigite:\n(a) para ler uma string S1\n(b) Imprimir tamanho da string S1\n(c) Comparar string S1 com S2 fornecida pelo usuário\n(d) Cocatenar String S1 com S2\n(e)Imprimir String S1 de forma inversa\n");
            choice = scan.next().charAt(0);
            switch(choice) {
                case 'a':
                    System.out.println("Informe o S1:");
                    S1 = scan.next();
                    break;

                case 'b':
                    int tam = S1.length();
                    System.out.printf("Tamanho da String: %d\n", tam);
                    break;

                case 'c':
                    System.out.println("Informe a String S2:");
                    S2 = scan.next();

                    System.out.println("Comparação de igualdade:");
                    if (S1.equals(S2)) {
                        System.out.println("As Strings são iguais");
                    } else {
                        System.out.println("As Strings são diferentes");
                    }

                    System.out.println("Comparação de igualdade ignorando caixas altas:");

                    if (S1.equalsIgnoreCase(S2)) {
                        System.out.println("As Strings comparadas com EqualsIgnorecase são iguais");
                    } else {
                        System.out.println("As Strings comparadas com EqualsIgnoracase são diferentes");
                    }

                    if (S1.compareTo(S2) == 0) {
                        System.out.println("As Strings comparadas com CompareTo são iguais");
                    } else {
                        System.out.println("As Strings comparadas com CompareTo são diferentes");
                    }

                    break;

                case 'd':
                    System.out.println("Informe a String S2:");
                    S2 = scan.next();
                    S1 = S1.concat(S2);
                    System.out.println(S1);
                    break;

                case 'e':
                    int Tam = S1.length();
                    char nome[] = new char[Tam];
                    nome = S1.toCharArray();

                    for (int i = nome.length - 1; i >= 0; i--) {
                        System.out.printf("%c", nome[i]);
                    }

                    break;

                default:
                    System.out.println("Letra inválida, informe outra:");
            }

        }

    }
}

