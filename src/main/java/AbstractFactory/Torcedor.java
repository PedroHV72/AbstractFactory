package AbstractFactory;

public class Torcedor {

    private IngressoInteira ingressoInteira;
    private IngressoMeia ingressoMeia;

    public Torcedor (FabricaAbstrata fabrica) {
        this.ingressoInteira = fabrica.createIngressoInteira();
        this.ingressoMeia = fabrica.createIngressoMeia();
    }

    public String emitirIngressoMeia() {
        return this.ingressoMeia.emitir();
    }

    public String emitirIngressoInteira() {
        return this.ingressoInteira.emitir();
    }

}
