import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhaNumero {
    public static void main(String[] args) {

        int quantidadeTentativas = 0;
        int numeroDigitadoUsuario = 0;

        int numeroAleatorio = new Random().nextInt(100);
        Scanner entrarComDado = new Scanner(System.in);

        while(quantidadeTentativas < 5){
            System.out.println("Digite um número de 0 a 100: ");
            numeroDigitadoUsuario = entrarComDado.nextInt();

            if(numeroDigitadoUsuario > numeroAleatorio){
                System.out.println("O número digitado é maior que o número gerado!");
            } else if (numeroDigitadoUsuario < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado!");
            }else{
                System.out.println(String.format("Parabéns, você acertou. O número aleatório gerado foi: %d", numeroAleatorio));
                break;
            }
            quantidadeTentativas++;
        }
        if (quantidadeTentativas == 5 && numeroDigitadoUsuario != numeroAleatorio){
            System.out.println("Você esgotou as tentativas, eram somente 5. O número aleatório gerado foi: " +numeroAleatorio);
        }
    }
}
