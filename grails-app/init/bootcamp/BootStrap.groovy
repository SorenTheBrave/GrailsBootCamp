package bootcamp

class BootStrap {

    def init = { servletContext ->
        new User(firstName: "Alex", lastName: "Hansen", title: "Full Stack Developer",
                description: "Enjoys programming, music, cartoons, and manifesting solutions into being!",
                age: 23, skills:["Grails","Javascript","Playing Music"]).save()
        new User(firstName: "Chris", lastName: "Judd", title: "Software Grand Wizard",
                description: "Can code you under the table. Has a stare that could kill a goat. An excellent teacher!",
                age: 40, skills: ["Code Wizardry","Teaching","Running a Business"]).save()
    }
    def destroy = {
    }
}
