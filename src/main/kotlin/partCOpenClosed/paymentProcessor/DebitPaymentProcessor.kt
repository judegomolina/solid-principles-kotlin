package partCOpenClosed.paymentProcessor

import common.enumClasses.OrderStatus
import partCOpenClosed.Order

class DebitPaymentProcessor: PaymentProcessor {

    override fun pay(order: Order, securityCode: String) {
        println("Processing debit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}