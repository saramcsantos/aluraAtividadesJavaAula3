import java.util.Scanner;

public class LacoRepeticaoWhile {
    public static void main(String[] args) {
        Scanner entrarComDado = new Scanner(System.in);
        double lerAvaliacaoDoFilme = 0;
        double mediaDasAvaliacoes = 0;
        int totalDeNotas = 0;

        while(lerAvaliacaoDoFilme != -1) {
            System.out.println("Digite uma nota para o filme de 0 a 10 ou -1 para encerrar o programa ");
            lerAvaliacaoDoFilme = entrarComDado.nextDouble();

            if (lerAvaliacaoDoFilme == -1) {
                break;
            }else{
                mediaDasAvaliacoes += lerAvaliacaoDoFilme;
                totalDeNotas++;
            }
        }
        if (mediaDasAvaliacoes == 0){
            System.out.println("Não foi possível calcular a média!");
        }else {
            System.out.println(String.format("A média das avalições foi: %.1f", mediaDasAvaliacoes / totalDeNotas));
        }
    }
}
