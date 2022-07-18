package partCOpenClosed.paymentProcessor

import common.enumClasses.OrderStatus
import partCOpenClosed.Order

class CreditPaymentProcessor: PaymentProcessor {

    override fun pay(order: Order, securityCode: String) {
        println("Processing credit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}