import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MicroondasTest {
    static Microondas microondas;
    
    @BeforeEach
    public void IniciarAntesDeCadaTeste(){
        microondas = new Microondas();
        microondas.init();
    }

    /*
     * Ajustar Temporizador:
     * 18 : 45
     */
    @Test
    public void AjustarTemporizadorValoresValidos() {
        assertEquals(true, microondas.atualizarTemporalizador(18, 45));
    }

    /*
     * Ver tempo atual do temporizador:
     * 18 : 45
     */
    @Test
    public void VerTempoAtualDoTemporalizador(){
        assertEquals("18 : 45", microondas.verTemp());
    }

}
