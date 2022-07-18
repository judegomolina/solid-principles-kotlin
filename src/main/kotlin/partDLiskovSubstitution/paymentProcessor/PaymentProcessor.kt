package partDLiskovSubstitution.paymentProcessor

import partDLiskovSubstitution.Order

interface PaymentProcessor {

    fun pay(order: Order)

}
