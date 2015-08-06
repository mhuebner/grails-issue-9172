package demo

class DemoController {

    def index() { }

    def create(Widget w) {
        render "Name: ${w.name}"
    }
}

class Widget {
    String name
}
