package partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor

import partEInterfaceSegregation.implementingThePrincipleComposition.Order

interface PaymentProcessor {

    fun pay(order: Order)

}
