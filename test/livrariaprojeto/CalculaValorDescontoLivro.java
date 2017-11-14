
package livrariaprojeto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moacyroliveira
 */
public class CalculaValorDescontoLivro {
    
    public CalculaValorDescontoLivro() {
    }
    
    @Test
    public void testMain() {
        
         Livro livro = new Livro.LivroBuilder()
               .nome("Java para Ninjas")
               .valor(60)
               .categoria("ebook")
               .Build();
       
        double valor = livro.getValor();
        CategoriaLivro categoria = CategoriaLivro.valueOf(livro.getCategoria());
        RegraCalculo regra = categoria.obterRegra();
        double valorCalculado = regra.calcula(valor);
        
         assertEquals(60 * 0.8 , valorCalculado, 0.00001);
    }
    
}
