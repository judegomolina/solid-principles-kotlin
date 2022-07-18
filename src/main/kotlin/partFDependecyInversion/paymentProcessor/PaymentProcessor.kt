package partFDependecyInversion.paymentProcessor

import partFDependecyInversion.Order

interface PaymentProcessor {

    fun pay(order: Order)

}
