package partCOpenClosed.paymentProcessor

import common.enumClasses.OrderStatus
import partCOpenClosed.Order

class PaypalPaymentProcessor: PaymentProcessor {

    override fun pay(order: Order, securityCode: String) {
        println("Processing PayPal payment")
        println("Verifying email: $securityCode")
        order.status = OrderStatus.PAID
    }

}