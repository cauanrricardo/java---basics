import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, s;
        System.out.print("Digite sua Nota 01: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite sua Nota 02: ");
        n2 = teclado.nextFloat();
        System.out.print("Digite sua Nota 03: ");
        n3 = teclado.nextFloat();
        s = (n1 + n2 + n3);
        System.out.println("Sua media eh: ");
        float media = s / 3;
        System.out.printf("%.2f \n", media);
        if(media >= 7.0 ){
            System.out.println("Aprovado! ");
        }
        else if (media >= 4.0 && media <7) {
            System.out.println("Ficou de final!");
        }
        else {
            System.out.println("Reprovado");
        }

    }
}