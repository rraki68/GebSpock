package Page

import Modules.HeaderModule
import Modules.HomeLaunchFooterModule
import Modules.HomeLaunchModule
import Modules.PlansModule
import geb.Page

/**
 * Created by rsuryanarayana on 8/12/2016.
 */
class Homepage extends Page {

    static at = { title == 'WordPress.com: Create a free website or blog' }

    static content = {

        headerbarModule {  module HeaderModule, $('.masterbar') }

        //module can be called in a page like below syntax also and above syntax also
        homeLaunchModule { module HomeLaunchModule }

        homeLaunchFooterModule { module HomeLaunchFooterModule }

        plansModule { module PlansModule }

    }
}