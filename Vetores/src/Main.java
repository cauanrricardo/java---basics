import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos: ");
        int n = teclado.nextInt();
       int vetor[] = new int[n];
       int c, soma = 0;
        System.out.println("Digite os " + n + " numeros" );
       for(c = 0; c < vetor.length; c++){
        int num = teclado.nextInt();
        soma += num;
       }
        System.out.println("A soma dos elemntos foi: ");
        System.out.println(soma);
    }
}