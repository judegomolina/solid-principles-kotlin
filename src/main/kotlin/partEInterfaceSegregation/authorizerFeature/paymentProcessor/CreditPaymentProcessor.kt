package partEInterfaceSegregation.authorizerFeature.paymentProcessor

import common.enumClasses.OrderStatus
import partEInterfaceSegregation.authorizerFeature.Order

class CreditPaymentProcessor(
    private val securityCode: String
): PaymentProcessor {

    override fun authSMS(code: String) {
        throw Exception("Credit card payment does not support SMS authentication")
    }

    override fun pay(order: Order) {
        println("Processing credit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}