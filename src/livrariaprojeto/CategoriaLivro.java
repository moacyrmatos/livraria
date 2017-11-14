
package livrariaprojeto;

/**
 *
 * @author moacyroliveira
 */
public enum CategoriaLivro {
    FICÇÃO {
        @Override
        public RegraCalculo obterRegra(){
            return new DezPorCento();
        }
    }
    , EBOOK{
        @Override
         public RegraCalculo obterRegra(){
            return new VintePorCento();
        }
    };
    
    public abstract RegraCalculo obterRegra();
}
