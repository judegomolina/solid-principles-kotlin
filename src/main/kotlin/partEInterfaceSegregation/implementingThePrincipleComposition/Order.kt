package partEInterfaceSegregation.implementingThePrincipleComposition

import common.enumClasses.OrderStatus
import java.math.BigDecimal

class Order(
    private var items: MutableList<String> = mutableListOf(),
    private var quantities: MutableList<Int> = mutableListOf(),
    private var prices: MutableList<BigDecimal> = mutableListOf(),
    var status: OrderStatus = OrderStatus.OPEN
) {

    val totalPrice: BigDecimal
        get() = prices.sumOf { it }

    fun addItem(name: String, quantity: Int, price: BigDecimal) {
        items.add(name)
        quantities.add(quantity)
        prices.add(price)
    }

}