package bootcamp

class HomeController {

    def index() {
        List<User> allUsers =  User.list()
        render(view: "/index", model: [users: allUsers])
    }

}

//import command.UserCommand
//import grails.validation.ValidationException
//import org.springframework.http.HttpStatus
//
//def newUser(){
//    render(template: "newUser")
//}
//
//def addUser(UserCommand cmd){
//    User newUser = new User(firstName: cmd.firstName, lastName: cmd.lastName, age: cmd.age,
//            description: cmd.description, skills: cmd.skills)
//    try{
//        newUser.save()
//    }catch(ValidationException ve){
//        render(status: HttpStatus.BAD_REQUEST, text: "Validation exception! ${ve.message}", )
//    }
//    render(status: HttpStatus.OK, text: "")
//}
//
//def deleteUser(Long userId){
//    User userToDelete = User.get(userId)
//    userToDelete?.delete()
//}
//
//def updateUser(UserCommand cmd){
//
//}