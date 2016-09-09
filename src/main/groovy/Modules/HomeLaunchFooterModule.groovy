package Modules

import geb.Module

/**
 * Created by Rakesh on 14-08-2016.
 */
class HomeLaunchFooterModule extends Module {

    static content = {

        createWebsite { $('.af-segments-item:nth-child(1)') }
        startaBlog { $('.af-segments-item:nth-child(2)') }
        discover { $('.af-segments-item:nth-child(3)') }
        footertable { $('.bf-features-list:nth-child(1)') }
    }
}
