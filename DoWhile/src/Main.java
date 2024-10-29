import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int s = 0;
        String r;
        int c = 0;
        do {
            System.out.print("Digite um numero: ");
            int n = teclado.nextInt();
            s += n;
            System.out.println("Deseja Continuar: ");
            r = teclado.next();
        } while(r.equals("S") || (r.equals("s")));
        System.out.println("Sua soma foi de: ");
        System.out.println(s);
    }
}