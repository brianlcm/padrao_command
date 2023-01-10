public class LigarComputadorTarefa implements Tarefa {

    private Computador computador;

    public LigarComputadorTarefa(Computador computador) {
        this.computador = computador;
    }

    public void executar() {
        this.computador.ligarComputador();
    }

    public void cancelar() {
        this.computador.desligarComputador();
    }
}
