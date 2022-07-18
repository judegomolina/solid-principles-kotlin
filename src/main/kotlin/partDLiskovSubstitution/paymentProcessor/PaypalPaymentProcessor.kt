package partDLiskovSubstitution.paymentProcessor

import common.enumClasses.OrderStatus
import partDLiskovSubstitution.Order

class PaypalPaymentProcessor(
    private val emailAddress: String
): PaymentProcessor {

    override fun pay(order: Order) {
        println("Processing PayPal payment")
        println("Verifying email: $emailAddress")
        order.status = OrderStatus.PAID
    }

}