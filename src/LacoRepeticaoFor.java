import java.util.Scanner;

public class LacoRepeticaoFor {
    public static void main(String[] args) {
        Scanner entrarComDado = new Scanner(System.in);
        double lerAvaliacaoDoFilme = 0;
        double mediaDasAvaliacoes = 0;

        for (int iterador = 0; iterador < 3; iterador++) {
            System.out.println("Digite uma nota para o filme de 0 a 10: ");
            lerAvaliacaoDoFilme = entrarComDado.nextDouble();
            mediaDasAvaliacoes += lerAvaliacaoDoFilme;
        }
        System.out.println(String.format("A média das avalições foi: %.1f", mediaDasAvaliacoes / 3));
    }
}
