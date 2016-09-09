package Modules

import geb.Module

/**
 * Created by Rakesh on 14-08-2016.
 */
class PlansModule extends Module {

    static content = {

        plansdiv { $('#plans') }
        freeColumn { $('.price-free-plan') }
        premiumColumn { $('.price-premium-plan') }
        businessColumn  { $('.price-business-plan') }

    }
}
