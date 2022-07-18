package partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor.authorizer.SMSAuthorizer
import partEInterfaceSegregation.implementingThePrincipleComposition.Order

class PaypalPaymentProcessor(
    private val emailAddress: String,
    private val authorizer: SMSAuthorizer
): PaymentProcessor {

    override fun pay(order: Order) {
        if ( ! authorizer.isAuthorized() ) { throw Exception("Not Authorized") }
        println("Processing PayPal payment")
        println("Verifying email: $emailAddress")
        order.status = OrderStatus.PAID
    }

}