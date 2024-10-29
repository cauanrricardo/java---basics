import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento (yyyy): ");
        int ano_nascimento = teclado.nextInt();
        int ano_atual = 2024;
        System.out.println("Sua idade eh");
        int idade = (ano_atual - ano_nascimento);
        System.out.println(idade + "anos");
        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
        boolean r = (idade>=18)?true:false;
        System.out.println(r);
    }
}