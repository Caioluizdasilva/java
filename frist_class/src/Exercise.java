public class Exercise {

        public static void main(String[] args) {
            double nota1 = 8.5;
            double nota2 = 7.3;
            double media = (nota1 + nota2) / 2.0;
            System.out.println("Média das notas: " + media);
            double valorDouble = 9.99;
            int valorInt = (int)valorDouble;
            System.out.println("Valor double: " + valorDouble);
            System.out.println("Valor após casting para int: " + valorInt);
            char letra = 'A';
            String palavra = "luno";
            String mensagem = "Mensagem: " + letra + palavra;
            System.out.println(mensagem);
            double precoProduto = 29.9;
            int quantidade = 3;
            double valorTotal = precoProduto * (double)quantidade;
            System.out.println("Valor total da compra: R$ " + valorTotal);
            double valorEmDolares = 50.0;
            double cotacaoDolar = 4.94;
            double valorEmReais = valorEmDolares * cotacaoDolar;
            System.out.printf("US$ %.2f equivale a R$ %.2f\n", valorEmDolares, valorEmReais);
            double precoOriginal = 120.0;
            double percentualDesconto = 10.0;
            double valorDesconto = precoOriginal * (percentualDesconto / 100.0);
            double precoComDesconto = precoOriginal - valorDesconto;
            System.out.printf("Preço original: R$ %.2f\n", precoOriginal);
            System.out.printf("Desconto: %.0f%% (R$ %.2f)\n", percentualDesconto, valorDesconto);
            System.out.printf("Preço com desconto: R$ %.2f\n", precoComDesconto);
        }
    }


