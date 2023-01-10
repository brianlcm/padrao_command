public class DesligarComputadorTarefa implements Tarefa {

    private Computador computador;

    public DesligarComputadorTarefa(Computador computador) {
        this.computador = computador;
    }

    public void executar() {
        this.computador.desligarComputador();
    }

    public void cancelar() {
        this.computador.ligarComputador();
    }
}
