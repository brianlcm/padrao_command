public class Computador {

    private int id;
    private int ano;
    private String modelo;
    private String situacao;

    public Computador(int id, int ano, String modelo) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ligarComputador() {
        this.situacao = "Computador ligado";
    }

    public void desligarComputador() {
        this.situacao = "Computador desligado";
    }
}
