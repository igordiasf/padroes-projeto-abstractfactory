package padroescriacao.abstractfactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class PizzaTest {
    @Test
    fun deveEmitirCatupiry() {
        val fabrica: FabricaAbstrata = FabricaMussarela()
        val pizza = Pizza(fabrica)
        Assertions.assertEquals("Frango com catupiry", pizza.emitirFrango())
    }

    @Test
    fun deveEmitirCheddar() {
        val fabrica: FabricaAbstrata = FabricaCheddar()
        val pizza = Pizza(fabrica)
        Assertions.assertEquals("Frango com cheddar", pizza.emitirFrango())
    }

}