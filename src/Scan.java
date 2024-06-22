import java.util.Scanner;

public class Scan {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
    }


}
