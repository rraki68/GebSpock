package Page

import geb.Page

/**
 * Created by Rakesh on 14-08-2016.
 */
class UserHomepage extends Page {

    static at = { title.contains 'Search ‹ Reader — WordPress.com' }

    static content = {

        searchComponent {$('.search__input')}
        userHeaer { $('#header')}
        readerIcon { $('.masterbar__item.masterbar__reader.is-active') }
        userProfileIcon{$('.masterbar__item-content>img')}
        profileName{ $('.profile-gravatar__user-display-name') }
        signOutButton{ $('.button.me-sidebar__signout-button.is-compact')}


    }
}
