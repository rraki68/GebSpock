package Modules

import geb.Module

/**
 * Created by Rakesh on 14-08-2016.
 */
class LoginModule extends Module {

    static content = {

        loginForm { $('#loginform')}
        username { $('#user_login')}
        password { $('#user_pass')}
        logInButton { $('#wp-submit')}

    }
}
