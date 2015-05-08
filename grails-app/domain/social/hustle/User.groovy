package social.hustle

class User {

    static hasMany = [parties: Party]

    String name
    String email
    UUID deviceId

    static constraints = {
        name empty:false
    }
}

class CheckIn {
    Date time
    Creator creator
    User user
    Event event
}
