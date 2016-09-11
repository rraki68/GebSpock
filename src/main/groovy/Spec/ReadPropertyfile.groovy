package Spec

import geb.spock.GebReportingSpec

/**
 * Created by Rakesh on 11-09-2016.
 */
class ReadPropertyfile extends GebReportingSpec
{

    FileInputStream fileInput = new FileInputStream(System.getProperty("E:\\Gebspock example\\GebSpock_WordpressSample\\src\\main\\resources\\propertyfile.properties"))
    prop.load(fileInput)

    def "access from property file"()
    {
        when "read propertyfile"

        prop.getProperty('headerlogo').click()

        then ""
    }
}
