package partEInterfaceSegregation.implementingThePrincipleComposition.paymentProcessor.authorizer

class SMSAuthorizer(
    private var authorized: Boolean = false
) {

    fun verifyCode(code: String) {
        println("Verifying code: $code")
        authorized = true
    }

    fun isAuthorized() = authorized

}