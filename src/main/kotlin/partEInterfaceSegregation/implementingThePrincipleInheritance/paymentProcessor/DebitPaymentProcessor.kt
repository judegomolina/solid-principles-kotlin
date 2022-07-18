package partEInterfaceSegregation.implementingThePrincipleInheritance.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.implementingThePrincipleInheritance.Order

class DebitPaymentProcessor(
    private val securityCode: String,
    private var verified: Boolean = false
): PaymentProcessorSMS {

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