import java.util.Objects;

public class Figura implements Comparable<Figura> {
    private String nomeSelecao;
    private int numeroFigura;
    private String descricao;
    private int quantidade;
    private boolean rara;
    public Figura(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }
    public String getNomeSelecao() {
        return nomeSelecao;
    }
    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }
    public int getNumeroFigura() {
        return numeroFigura;
    }
    public void setNumeroFigura(int numeroFigura) {
        this.numeroFigura = numeroFigura;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean getRara() {
        return rara;
    }
    public void setRara(boolean rara) {
        this.rara = rara;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return numeroFigura == figura.numeroFigura;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroFigura);
    }

    public int compareTo(Figura outra) {
        return Integer.compare(this.numeroFigura, outra.numeroFigura);
    }
    @Override
    public String toString() {
        return "| Nome da Seleção: " + nomeSelecao + "| Número Figura: " + numeroFigura + "| Descrição: " + descricao + "| Quantidade: " + quantidade + "| Rara: " + rara;
    }


}


