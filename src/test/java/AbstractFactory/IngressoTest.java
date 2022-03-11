package AbstractFactory;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IngressoTest {

    @Test
    void deveEmitirIngressoMeia() {
        FabricaAbstrata fabrica = new FabricaIngresso();
        Torcedor torcedor = new Torcedor(fabrica);
        assertEquals("Ingresso Meia", torcedor.emitirIngressoMeia());
    }

    @Test
    void deveEmitirIngressoInteira() {
        FabricaAbstrata fabrica = new FabricaIngresso();
        Torcedor torcedor = new Torcedor(fabrica);
        assertEquals("Ingresso Inteira", torcedor.emitirIngressoInteira());
    }

}
