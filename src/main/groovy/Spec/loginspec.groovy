import Model.LoginData
import Page.Homepage
import Page.Loginpage
import Page.UserHomepage
import geb.spock.GebReportingSpec

/**
 * Created by Rakesh on 14-08-2016.
 */
class loginspec extends GebReportingSpec{

    def "login validation"() {

        when:'load home page'
        to Homepage

        then:' Homepage loaded'
        at Homepage
        headerbarModule.headerlinks.displayed
        homeLaunchModule.seePlansButton.displayed
        homeLaunchFooterModule.discover.displayed
        plansModule.freeColumn.displayed

        when:'click on login'
        headerbarModule.loginLink.click()

        then:'In Login Page'
        at Loginpage
        loginModule.logInButton.displayed

        when:'enter user/pwd and login'
        loginModule.username = LoginData.username
        loginModule.password = LoginData.password
        loginModule.logInButton.click()

        then :'Successfully logged in'
        at UserHomepage
        searchComponent.displayed

        when :'At user homepage'
        userProfileIcon.click()

        then :'User profile page is displayed'
        profileName.displayed
        signOutButton.displayed

    }
}
