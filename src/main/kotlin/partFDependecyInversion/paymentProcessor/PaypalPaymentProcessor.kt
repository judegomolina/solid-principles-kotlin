package partFDependecyInversion.paymentProcessor

import common.enumClasses.OrderStatus
import partFDependecyInversion.Order
import partFDependecyInversion.paymentProcessor.authorizer.Authorizer

class PaypalPaymentProcessor(
    private val emailAddress: String,
    private val authorizer: Authorizer
): PaymentProcessor {

    override fun pay(order: Order) {
        if ( ! authorizer.isAuthorized() ) { throw Exception("Not Authorized") }
        println("Processing PayPal payment")
        println("Verifying email: $emailAddress")
        order.status = OrderStatus.PAID
    }

}