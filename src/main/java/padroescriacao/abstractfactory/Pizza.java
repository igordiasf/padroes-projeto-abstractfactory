package padroescriacao.abstractfactory;

public class Pizza {

    private Queijo Queijo;
    private Frango Frango;

    public Pizza(FabricaAbstrata fabrica) {
        this.Queijo = fabrica.createQueijo();
        this.Frango = fabrica.createFrango();
    }

    public String emitirQueijo() {
        return this.Queijo.emitir();
    }

    public String emitirFrango() {
        return this.Frango.emitir();
    }
}