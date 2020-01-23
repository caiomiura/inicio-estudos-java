import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
public class exercicio2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
            int N = sc.nextInt();
            if (N % 2 == 0){
                System.out.println("Par");
            }
            else{
                System.out.println("Impar");
            }
            sc.close();
    }

}
