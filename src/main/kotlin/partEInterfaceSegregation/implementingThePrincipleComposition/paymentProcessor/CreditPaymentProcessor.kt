package partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.implementingThePrincipleComposition.Order

class CreditPaymentProcessor(
    private val securityCode: String
): PaymentProcessor {

    override fun pay(order: Order) {
        println("Processing credit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}