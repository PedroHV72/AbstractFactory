package AbstractFactory;

public class FabricaIngresso implements FabricaAbstrata{
    @Override
    public IngressoMeia createIngressoMeia() {
        return new IngressoMeia();
    }

    @Override
    public IngressoInteira createIngressoInteira() {
        return new IngressoInteira();
    }
}
