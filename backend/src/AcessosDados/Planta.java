package AcessosDados;

public class Planta {
    
    private String nome_cientifico;
    private String nome_popular;
    private String ultima_adubação;
    private int quantidade_em_estoque;
  

    public Planta(String nome_cientifico, String nome_popular, String ultima_adubação, int quantidade_em_estoque) {
        this.nome_cientifico = nome_cientifico;
        this.nome_popular = nome_popular;
        this.ultima_adubação = ultima_adubação;
        this.quantidade_em_estoque = quantidade_em_estoque;
    }

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public String getNome_popular() {
        return nome_popular;
    }

    public String getUltima_adubação() {
        return ultima_adubação;
    }

    public int getQuantidade_em_estoque() {
        return quantidade_em_estoque;
    }    
    
}
