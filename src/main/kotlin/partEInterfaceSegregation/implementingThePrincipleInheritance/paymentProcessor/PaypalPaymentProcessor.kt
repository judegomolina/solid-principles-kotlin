package partEInterfaceSegregation.implementingThePrincipleInheritance.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.implementingThePrincipleInheritance.Order

class PaypalPaymentProcessor(
    private val emailAddress: String,
    private var verified: Boolean = false
): PaymentProcessorSMS {

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