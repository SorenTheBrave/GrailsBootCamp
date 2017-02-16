package bootcamp

class User {

    String          firstName
    String          lastName
    String          title
    String          description
    Long            age
    List<String>    skills

    String getFullName(){
        return this.firstName + " " + this.lastName
    }

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        age validator: {it > 0 && it < 125}
    }
}
