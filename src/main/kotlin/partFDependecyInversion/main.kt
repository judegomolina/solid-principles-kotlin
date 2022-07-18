package partFDependecyInversion

import partFDependecyInversion.paymentProcessor.PaypalPaymentProcessor
import partFDependecyInversion.paymentProcessor.authorizer.NotARobotAuthorizer
import java.math.BigDecimal

fun main() {
    val order = Order()
    order.addItem("Keyboard", 1, BigDecimal(50))
    order.addItem("SSD", 1, BigDecimal(150))
    order.addItem("Mouse", 2, BigDecimal(50))

    println("The total price of the order is: ${order.totalPrice}")

    val authorizer = NotARobotAuthorizer()
    val processor = PaypalPaymentProcessor("juan.molina@inventa.shop", authorizer)
    authorizer.validateCaptcha("Not a robot, bro!")
    processor.pay(order)
}
