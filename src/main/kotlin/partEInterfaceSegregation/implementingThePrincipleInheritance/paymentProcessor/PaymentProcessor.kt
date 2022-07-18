package partEInterfaceSegregation.implementingThePrincipleInheritance.paymentProcessor

import partEInterfaceSegregation.implementingThePrincipleInheritance.Order

interface PaymentProcessor {

    fun pay(order: Order)

}
