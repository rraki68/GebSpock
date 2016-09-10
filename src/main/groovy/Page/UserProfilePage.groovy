package Page

import geb.Page

/**
 * Created by Rakesh on 10-09-2016.
 */
class UserProfilePage extends Page{

    static at = { sidebar.displayed }

   static content = {
       sidebar {$('.sidebar')}

   }

}
