package partBSingleResponsibility

import common.enumClasses.PaymentType
import java.math.BigDecimal

fun main() {
    val order = Order()
    order.addItem("Keyboard", 1, BigDecimal(50))
    order.addItem("SSD", 1, BigDecimal(150))
    order.addItem("Mouse", 2, BigDecimal(50))

    println("The total price of the order is: ${order.totalPrice}")

    val processor = PaymentProcessor()
    processor.payDebit(order, "123456XYZ")
}