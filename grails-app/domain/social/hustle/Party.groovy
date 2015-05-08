package social.hustle

class Party {

    static hasMany = [creators : Creator]
    static belongsTo = [Event]

    Event event
    String name
    String reward

    static constraints = {
        //TODO event not null
        name blank:false
        //TODO verify that all creators have the event
    }
}
