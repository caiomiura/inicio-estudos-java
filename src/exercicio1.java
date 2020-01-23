import java.util.Scanner;
//Exercicio para saber se o numero é negativo ou não
public class exercicio1 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Não negativo");
        }

        sc.close();

        }
    }

