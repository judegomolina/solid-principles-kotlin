package partABaseCode

import common.enumClasses.OrderStatus
import common.enumClasses.PaymentType
import java.math.BigDecimal

class Order(
    private var items: MutableList<String> = mutableListOf(),
    private var quantities: MutableList<Int> = mutableListOf(),
    private var prices: MutableList<BigDecimal> = mutableListOf(),
    private var status: OrderStatus = OrderStatus.OPEN
) {

    val totalPrice: BigDecimal
        get() = prices.sumOf { it }

    fun addItem(name: String, quantity: Int, price: BigDecimal) {
        items.add(name)
        quantities.add(quantity)
        prices.add(price)
    }

    fun pay(paymentType: PaymentType, securityCode: String) {
        // In a real life scenario here we would have an actual integration

        if (paymentType == PaymentType.DEBIT) {
            println("Processing debit payment")
            println("Verifying security code: $securityCode")
            status = OrderStatus.PAID

        } else {
            println("Processing debit payment")
            println("Verifying security code: $securityCode")
            status = OrderStatus.PAID

        }
    }

}