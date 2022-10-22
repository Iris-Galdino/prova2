package aplicativos;

public class Produto {
    String codigo;
    String nome;
    String valor;
    String quantidadeEstoque;

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getcodigo() {
        return codigo;
      }
      public void setcodigo(String codigo) {
        this.codigo = codigo;
      }
      public String getNome() {
        return nome;
      }
      public void setNome(String nome) {
        this.nome = nome;
      }
      public void add(int quantidadeRegistrada, Produto[] p) {
      }
      @Override
    public String toString() {
        return "Código: " + this.getcodigo()+ "\nNome: " + this.getNome()+ "\nValor: "
        + this.getValor()+ "\nQuantidade em estoque: " + getQuantidadeEstoque();
    }
    }
    
