package partFDependecyInversion.paymentProcessor.authorizer

class NotARobotAuthorizer(
    private var authorized: Boolean = false
): Authorizer {

    fun validateCaptcha(captchaResult: String) {
        println("Validating captcha result: $captchaResult")
        println("User is not a robot")
        authorized = true
    }

    override fun isAuthorized() = authorized

}