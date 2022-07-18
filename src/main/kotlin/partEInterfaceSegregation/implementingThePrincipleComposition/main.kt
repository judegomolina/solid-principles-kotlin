package partEInterfaceSegregation.implementingThePrincipleComposition

import partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor.PaypalPaymentProcessor
import partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor.authorizer.SMSAuthorizer
import java.math.BigDecimal

fun main() {
    val order = Order()
    order.addItem("Keyboard", 1, BigDecimal(50))
    order.addItem("SSD", 1, BigDecimal(150))
    order.addItem("Mouse", 2, BigDecimal(50))

    println("The total price of the order is: ${order.totalPrice}")

    val authorizer = SMSAuthorizer()
    val processor = PaypalPaymentProcessor("juan.molina@inventa.shop", authorizer)
    authorizer.verifyCode("ABC123")
    processor.pay(order)
}
