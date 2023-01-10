import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaboratorioTest {

    Laboratorio laboratorio;
    Computador computador;

    @BeforeEach
    void setUp() {
        laboratorio = new Laboratorio();
        computador = new Computador (001, 2016, "Modelo 1");
    }

    @Test
    void deveLigarComputador() {
        Tarefa ligarComputador = new LigarComputadorTarefa(computador);
        laboratorio.executarTarefa(ligarComputador);

        assertEquals("Computador ligado", computador.getSituacao());
    }

    @Test
    void deveDesligarComputador() {
        Tarefa desligarComputador = new DesligarComputadorTarefa(computador);
        laboratorio.executarTarefa(desligarComputador);

        assertEquals("Computador desligado", computador.getSituacao());
    }

    @Test
    void deveCancelarDesligamentoComputador() {
        Tarefa ligarComputador = new LigarComputadorTarefa(computador);
        Tarefa desligarComputador = new DesligarComputadorTarefa(computador);

        laboratorio.executarTarefa(ligarComputador);
        laboratorio.executarTarefa(desligarComputador);

        laboratorio.cancelarUltimaTarefa();

        assertEquals("Computador ligado", computador.getSituacao());
    }

}