package demo

import org.demo.widget.Widget

class DemoController {

    static allowedMethods = [update: "PUT"]

    def index() { }

    def create(Widget w) {
        render "Name: ${w.name}"
    }

    def edit() {
        def widget = new Widget(name: 'Widget 1')
        respond widget
    }

    def update(Widget w) {
        if (w.hasErrors()) {
            respond w, view: 'edit'
            return
        }
        render "Name: ${w.name}, Version: ${w.version}"
    }
}


