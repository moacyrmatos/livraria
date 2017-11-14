
package livrariaprojeto;

/**
 *
 * @author moacyroliveira
 */
public class CalculaValorDescontoLivro {

    public static void main(String[] args) {
        
       Livro livro = new Livro.LivroBuilder()
               .nome("Java para Ninjas")
               .valor(60)
               .categoria("ebook")
               .Build();
       
        double valor = livro.getValor();
        CategoriaLivro categoria = CategoriaLivro.valueOf(livro.getCategoria());
        RegraCalculo regra = categoria.obterRegra();
        double valorCalculado = regra.calcula(valor);
        
        System.out.println(livro.toString());
        System.out.println("Valor do livro com desconto = "+valorCalculado);
    
    }
    
}
