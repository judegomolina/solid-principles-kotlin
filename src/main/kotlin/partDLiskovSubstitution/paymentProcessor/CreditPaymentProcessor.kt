package partDLiskovSubstitution.paymentProcessor

import common.enumClasses.OrderStatus
import partDLiskovSubstitution.Order

class CreditPaymentProcessor(
    private val securityCode: String
): PaymentProcessor {

    override fun pay(order: Order) {
        println("Processing credit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}