package partEInterfaceSegregation.authorizerFeature.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.authorizerFeature.Order

class PaypalPaymentProcessor(
    private val emailAddress: String,
    private var verified: Boolean = false
): PaymentProcessor {

    override fun authSMS(code: String) {
        println("Verifying SMS code: $code")
        verified = true
    }

    override fun pay(order: Order) {
        if ( ! verified ) { throw Exception("Not Authorized") }
        println("Processing PayPal payment")
        println("Verifying email: $emailAddress")
        order.status = OrderStatus.PAID
    }

}