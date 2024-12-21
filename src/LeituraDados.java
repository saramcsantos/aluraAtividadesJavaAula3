import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        // system.in verifica se houve alguma entrada de dado pelo teclado
        Scanner entrarComDado = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String lerFilmeDigitado = entrarComDado.nextLine();
        System.out.println("Digite o ano de lançamento do filme: ");
        int lerAnoDoLancamento = entrarComDado.nextInt();
        System.out.println("Digite sua avaliação para o filme, de 0 a 10: ");
        double lerAvaliacaoDoFilme = entrarComDado.nextDouble();

        /*nextLine ler o que está sendo digitado em caso de texto,
        em caso de número inteiro use nextInt ou se for um número decimal use nextDouble.
        O importante é entender que o next se comporta de forma diferente a depender do
        tipo de dado digitado*/

        String informacoesDoFilmeFavorito = """
                O seu filme favorito é: %s,
                O ano de lançamento deste  filme foi em: %d
                e você deu a nota %.1f
                """.formatted(lerFilmeDigitado,lerAnoDoLancamento,lerAvaliacaoDoFilme);
        System.out.println(informacoesDoFilmeFavorito);
    }
}
