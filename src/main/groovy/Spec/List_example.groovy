package Spec

import Modules.HomeLaunchModule
import Page.CreateSitepage
import Page.Homepage
import geb.spock.GebReportingSpec

/**
 * Created by Rakesh on 21-08-2016.
 */
class List_example extends GebReportingSpec {

    def "login validation"() {

        when: 'load home page'
        to Homepage

        then: ' Homepage loaded'
        at Homepage

        when: 'click on login'

        homeLaunchModule.createWebsiteButton.click()



        then:''
        to CreateSitepage

        println(createSiteListModule.Sitetype)
    }
}
