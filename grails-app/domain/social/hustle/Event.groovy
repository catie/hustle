package social.hustle

class Event {

    Map creators
    static hasMany = [creators:Creator, parties:Party]

    enum EventStatus {
        PENDING, OPEN, CLOSED
    }

    String name
    EventStatus status

    static constraints = {
        name blank:false
        status blank:false
    }
}
