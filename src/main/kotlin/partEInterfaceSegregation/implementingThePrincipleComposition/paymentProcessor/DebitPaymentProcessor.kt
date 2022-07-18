package partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor.authorizer.SMSAuthorizer
import partEInterfaceSegregation.implementingThePrincipleComposition.Order

class DebitPaymentProcessor(
    private val securityCode: String,
    private val authorizer: SMSAuthorizer
): PaymentProcessor {

    override fun pay(order: Order) {
        if ( ! authorizer.isAuthorized() ) { throw Exception("Not Authorized") }
        println("Processing debit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}