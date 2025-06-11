public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Top Gun";
        meuFilme.anoDeLancamento = 1999;
        meuFilme.duracaoEmMinutos = 135;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Média de avaliações do filme: " +meuFilme.pegaMedia());

    }

}