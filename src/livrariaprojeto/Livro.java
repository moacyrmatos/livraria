
package livrariaprojeto;

/**
 *
 * @author moacyroliveira
 */
public class Livro {

    private String nome;
    private double valor;
    private String categoria;
    
    public Livro(String nome, double valor, String categoria) {
        this.nome = nome.toUpperCase();
        this.valor = valor;
        this.categoria = categoria.toUpperCase();
    }

    @Override
    public String toString() {
        return "Livro[" +
                "nome = " + nome +
                ", valor = " + valor +
                ", categoria = " + categoria +
                "]";
    }

    public static class LivroBuilder {
        private String nome;
        private double valor;
        private String categoria;

        public LivroBuilder() {

        }

        public LivroBuilder nome(String nome) {
            this.nome = nome.toUpperCase();
            return this;
        }

        public LivroBuilder valor(double valor) {
            this.valor = valor;
            return this;
        }
        
        public LivroBuilder categoria(String categoria) {
            this.categoria = categoria.toUpperCase();
            return this;
        }

        public Livro Build() {
            return new Livro(nome, valor, categoria);
        }

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria.toUpperCase();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
}
