
package livrariaprojeto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moacyroliveira
 */
public class LivroTest {
    
    public LivroTest() {
    }
  
    @Test
    public void LivroTeste() {
        
        Livro livro = new Livro.LivroBuilder()
                .nome("Livro")
                .valor(50)
                .categoria("Categoria")
                .Build();
        
        assertEquals("Livro[nome = LIVRO, valor = 50.0, categoria = CATEGORIA]", livro.toString());
    }

  
    
    
}
