package Spec

import Page.Homepage
import geb.spock.GebReportingSpec

/**
 * Created by Rakesh on 10-09-2016.
 */
class MouseoverSample_Spec extends GebReportingSpec{

    def "login validation"() {

        when: 'load home page'
        to Homepage

        then: 'Homepage loaded'

        /*writing proper css selector is impt here to select specific value
        make sure the css is pointing to the text value, not the parent element*/
        println ( headerbarModule.headerlinks[4].text() )

        interact {
            moveToElement (headerbarModule.headerlinks[4])
            Thread.sleep(1000)
            moveToElement ($('.menu-features>a'))
        }
    }
}
