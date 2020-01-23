import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class exercicio4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de inicio do jogo");
        int horaInicio = sc.nextInt();
        System.out.println("Digite a hora do fim do jogo");
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicio < horaFinal ) {
            duracao = horaFinal - horaInicio;

        } else{
            duracao = 24 - horaInicio + horaFinal;
    }
        System.out.println("A duração do jogo foi de: " + duracao + "Hora(S)");

        sc.close();



    }
}
