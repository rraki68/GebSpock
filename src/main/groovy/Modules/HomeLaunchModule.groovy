package Modules

import geb.Module

/**
 * Created by Rakesh on 13-08-2016.
 */
class HomeLaunchModule extends Module{

   static content = {

    homeLaunchdiv { $('.home-launch-cta') }
    //MainText  { $('div.home-launch-cta>h1').textContent }
    mainText { $('div.home-launch-cta') }
    createWebsiteButton { $('#top-create-website-button') }
    seePlansButton { $('#top-see-plans-button') }
    createWebsiteButton2 { $('#plans-create-website-button') }

    }
}
