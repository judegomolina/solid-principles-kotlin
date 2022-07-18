package partEInterfaceSegregation.implementingThePrincipleInheritance.paymentProcessor

interface PaymentProcessorSMS: PaymentProcessor {

    fun authSMS(code: String)

}