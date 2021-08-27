package padroescriacao.abstractfactory;

public class FabricaMussarela implements FabricaAbstrata {

    @Override
    public Queijo createQueijo() {
        return new Prato();
    }

    @Override
    public Frango createFrango() {
        return new Catupiry();
    }
}
