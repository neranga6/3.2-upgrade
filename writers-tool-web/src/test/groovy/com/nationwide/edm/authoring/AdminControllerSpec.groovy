package com.nationwide.edm.authoring

import grails.test.mixin.TestFor
import org.junit.Ignore
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HomeController)
class AdminControllerSpec extends Specification {
     void testabout() {
        when:
        controller.about()
        then:
        view == "/home/about"
    }
}

