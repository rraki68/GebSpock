package Spec

import Page.Homepage
import geb.spock.GebReportingSpec

/**
 * Created by Rakesh on 21-08-2016.
 */
class List_example extends GebReportingSpec {

    def "login validation"() {

        when: 'load home page'
        to Homepage

        then: 'Homepage loaded'

        /*writing proper css selector is impt here to select specific value
        make sure the css is pointing to the text value, not the parent element*/
        println ( headerbarModule.headerlinks[4].text() )
    }
}
