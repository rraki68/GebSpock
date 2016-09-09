package Modules

import geb.Module

/**
 * Created by Rakesh on 21-08-2016.
 */
class CreateSiteListModule extends Module{

    static content = {

       Sitetype  {('.card.survey-step__vertical.is-card-link').text()}
    }
}
