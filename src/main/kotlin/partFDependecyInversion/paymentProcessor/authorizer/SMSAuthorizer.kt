package partFDependecyInversion.paymentProcessor.authorizer

class SMSAuthorizer(
    private var authorized: Boolean = false
): Authorizer {

    fun verifyCode(code: String) {
        println("Verifying code: $code")
        authorized = true
    }

    override fun isAuthorized() = authorized

}