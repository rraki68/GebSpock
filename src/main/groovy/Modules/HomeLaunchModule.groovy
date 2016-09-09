package Modules

import geb.Module

/**
 * Created by Rakesh on 13-08-2016.
 */
class HomeLaunchModule extends Module{

   static content = {

    homeLaunchdiv { $('.home-launch-cta') }
    mainText { $('div.home-launch-cta') }
    createWebsiteButton { $('#top-create-website-button') }
    seePlansButton { $('#top-see-plans-button1') }
    createWebsiteButton2 { $('#plans-create-website-button') }

    }
}
