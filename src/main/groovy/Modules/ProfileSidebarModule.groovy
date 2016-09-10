package Modules

import geb.Module

/**
 * Created by Rakesh on 10-09-2016.
 */
class ProfileSidebarModule extends Module {

    static content = {
        sidebar { $('.sidebar__menu') }
        sidebarlinks { $('.menu-link-text') }
    }
}
