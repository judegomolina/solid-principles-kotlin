package partBSingleResponsibility

import common.enumClasses.OrderStatus
import common.enumClasses.PaymentType
import java.math.BigDecimal

// Not responsible anymore for processing the payment
class Order(
    private var items: MutableList<String> = mutableListOf(),
    private var quantities: MutableList<Int> = mutableListOf(),
    private var prices: MutableList<BigDecimal> = mutableListOf(),
    var status: OrderStatus = OrderStatus.OPEN // We make this property public to allow modification from the processor
) {

    val totalPrice: BigDecimal
        get() = prices.sumOf { it }

    fun addItem(name: String, quantity: Int, price: BigDecimal) {
        items.add(name)
        quantities.add(quantity)
        prices.add(price)
    }

}