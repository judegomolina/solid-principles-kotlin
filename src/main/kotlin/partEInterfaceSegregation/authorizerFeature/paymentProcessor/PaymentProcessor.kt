package partEInterfaceSegregation.authorizerFeature.paymentProcessor

import partEInterfaceSegregation.authorizerFeature.Order

// Generic interface
interface PaymentProcessor {

    fun authSMS(code: String) // Not supported in every payment method

    fun pay(order: Order)

}
