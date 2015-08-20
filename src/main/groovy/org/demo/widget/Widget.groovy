package org.demo.widget

import grails.validation.Validateable

class Widget implements Validateable {
    Long id = 1
    String name
    Long version = 1

    static constraints = {
        id nullable: false
        name nullable: false, blank: false
    }
}
