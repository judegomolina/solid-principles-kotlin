package partEInterfaceSegregation.authorizerFeature.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.authorizerFeature.Order

class DebitPaymentProcessor(
    private val securityCode: String,
    private var verified: Boolean = false
): PaymentProcessor {

    override fun authSMS(code: String) {
        println("Verifying SMS code: $code")
        verified = true
    }

    override fun pay(order: Order) {
        if ( ! verified ) { throw Exception("Not Authorized") }
        println("Processing debit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}