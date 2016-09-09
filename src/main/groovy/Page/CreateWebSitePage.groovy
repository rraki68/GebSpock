package Page

import Modules.CreateWebsiteContentModule
import geb.Page

/**
 * Created by Rakesh on 14-08-2016.
 */
class CreateWebSitePage extends Page {

    static at = { H1Text }

    static content = {

        H1Text {'.step-header__title'}

        createWebsiteContentModule { module CreateWebsiteContentModule }
    }
}
