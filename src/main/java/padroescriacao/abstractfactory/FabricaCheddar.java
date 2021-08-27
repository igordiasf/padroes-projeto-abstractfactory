package padroescriacao.abstractfactory;

public class FabricaCheddar implements FabricaAbstrata {

    @Override
    public Queijo createQueijo() {
        return new Prato();
    }

    @Override
    public Frango createFrango() {
        return new Cheddar();
    }
}
