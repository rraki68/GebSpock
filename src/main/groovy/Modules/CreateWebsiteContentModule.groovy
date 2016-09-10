package Modules

import geb.Module

/**
 * Created by Rakesh on 09-09-2016.
 */
class CreateWebsiteContentModule extends Module {

    static content = {

        WebsiteabtText(wait: true) { $('.card.survey-step__question.is-compact>label') }

    }
}
