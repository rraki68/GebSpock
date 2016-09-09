package Page

import Modules.LoginModule
import geb.Page

/**
 * Created by Rakesh on 14-08-2016.
 */
class Loginpage extends Page {

    static at = { title.endsWith('Log In') }

    static content = {

    loginModule { module LoginModule }

    }
}
