package partBSingleResponsibility

import common.enumClasses.OrderStatus

class PaymentProcessor {

    fun payDebit(order: Order, securityCode: String) {
        println("Processing debit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

    fun payCredit(order: Order, securityCode: String) {
        println("Processing credit payment")
        println("Verifying security code: $securityCode")
        order.status = OrderStatus.PAID
    }

}