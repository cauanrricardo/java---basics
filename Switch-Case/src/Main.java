import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo;
        System.out.println("Digite a quantidade de pernas: ");
        int n = teclado.nextInt();
        switch(n){
            case 1:
                tipo = "Campeao";
                break;
            case 2:
                tipo = "Bi";
                break;
            case 3:
                tipo = "Tri";
                break;
            case 4:
                tipo = "Tetra";
                break;
            case 5:
                tipo = "Penta";
                break;
            case 6:
                tipo = "Hexa";
                break;
            default:
                tipo = "Maior de todos";
                break;
        }
        System.out.println(tipo);
    }
}