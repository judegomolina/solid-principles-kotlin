package partFDependecyInversion.paymentProcessor

import common.enumClasses.OrderStatus
import partFDependecyInversion.Order
import partFDependecyInversion.paymentProcessor.authorizer.Authorizer

class DebitPaymentProcessor(
    private val securityCode: String,
    private val authorizer: Authorizer
): PaymentProcessor {

    override fun pay(order: Order) {
        if ( ! authorizer.isAuthorized() ) { throw Exception("Not Authorized") }
        println("Processing debit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}