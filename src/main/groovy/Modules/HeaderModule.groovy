package Modules

import geb.Module

/**
 * Created by Rakesh on 13-08-2016.
 */
class HeaderModule extends Module {

    static content = {

        headerlinks { $('.wpcom-pages') }
        headerlogo  { $('.wpcom-logo') }
        loginLink   { $('.login-link') }

    }
}
