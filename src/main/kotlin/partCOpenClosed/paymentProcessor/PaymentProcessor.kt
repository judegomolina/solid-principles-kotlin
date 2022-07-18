package partCOpenClosed.paymentProcessor

import partCOpenClosed.Order

interface PaymentProcessor {

    fun pay(order: Order, securityCode: String)

}