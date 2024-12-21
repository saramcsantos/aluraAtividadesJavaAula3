public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoDoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Filmes que os clientes estão curtindo!");
        }else{
            System.out.println("Filmes retrô que vale a pena assistir!");
        }

        if (!incluidoNoPlano || tipoDoPlano.equals("plus")){
            System.out.println("Acesso ao filme está liberado por ser assinante Plus!");
        }else{
            System.out.println("O filme escolhido não está incluíndo no plano Normal!");
        }

        if (!incluidoNoPlano || tipoDoPlano.equals("plus")){
            System.out.println("Acesso ao filme está liberado!");
        }else{
            System.out.println("Assine o plano plus para ter acesso ao filme!");
        }

        if (incluidoNoPlano && tipoDoPlano.equals("normal")){
            System.out.println("Acesso ao filme está liberado. Filme está incluso no plano Normal.");
        }else{
            System.out.println("Acesso ao filme negado. Filme não está incluso no plano Normal.");
        }
    }
}
