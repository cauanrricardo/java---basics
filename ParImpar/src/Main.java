import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = teclado.nextInt();
        if(n1 % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Nao");
        }

    }
}