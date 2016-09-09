package Page

import Modules.CreateSiteListModule
import geb.Page

/**
 * Created by Rakesh on 14-08-2016.
 */
class CreateSitepage extends Page {

    static at = { title == 'WordPress.com: Create a free website or blog' }

    static content = {

        createSiteListModule { moduleList CreateSiteListModule }
        createSiteTable { $('.card.survey-step__vertical.is-card-link') }
    }
}
