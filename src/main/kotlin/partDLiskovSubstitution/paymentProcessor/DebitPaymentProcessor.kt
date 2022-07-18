package partDLiskovSubstitution.paymentProcessor

import common.enumClasses.OrderStatus
import partDLiskovSubstitution.Order

class DebitPaymentProcessor(
    private val securityCode: String
): PaymentProcessor {

    override fun pay(order: Order) {
        println("Processing debit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}