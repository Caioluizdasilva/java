public class Main{
    public static void main(String[] args) {
        // 1. Média de duas notas decimais
        double nota1 = 8.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // 2. Casting de double para int
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // casting explícito
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor após casting para int: " + valorInt);

        // 3. Concatenação de char e String
        char letra = 'A';
        String palavra = "luno";
        String mensagem = "Mensagem: " + letra + palavra;
        System.out.println(mensagem);

        // 4. Cálculo do valor total do produto
        double precoProduto = 29.90;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total da compra: R$ " + valorTotal);

        // 5. Conversão de dólar para real
        double valorEmDolares = 50.0;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.printf("US$ %.2f equivale a R$ %.2f\n", valorEmDolares, valorEmReais);

        // 6. Cálculo de desconto
        double precoOriginal = 120.00;
        double percentualDesconto = 10.0; // 10%
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.printf("Preço original: R$ %.2f\n", precoOriginal);
        System.out.printf("Desconto: %.0f%% (R$ %.2f)\n", percentualDesconto, valorDesconto);
        System.out.printf("Preço com desconto: R$ %.2f\n", precoComDesconto);
    }
}