package Spec

import Modules.CreateWebsiteContentModule
import Page.CreateWebSitePage
import Page.Homepage
import geb.spock.GebReportingSpec

/**
 * Created by rsuryanarayana on 8/12/2016.
 */
class PageValidation_Spec extends GebReportingSpec {

  def 'load wordpress'() {

    when:'page load'

      to Homepage

    then:'check tittle'

      at Homepage

      headerbarModule.displayed
      headerbarModule.headerlogo.displayed

      homeLaunchModule.createWebsiteButton.displayed
      homeLaunchModule.createWebsiteButton2.displayed
      homeLaunchModule.seePlansButton.displayed

      homeLaunchFooterModule.createWebsite.displayed
      homeLaunchFooterModule.startaBlog.displayed
      homeLaunchFooterModule.discover.displayed

      plansModule.freeColumn.displayed
      plansModule.premiumColumn.displayed
      plansModule.businessColumn.displayed

    when: 'Click on create website'

      homeLaunchModule.createWebsiteButton.click()

    then:''

      at CreateWebSitePage

    createWebsiteContentModule.displayed
    createWebsiteContentModule.WebsiteabtText.displayed


  }
}
