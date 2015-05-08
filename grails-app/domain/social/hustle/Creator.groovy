package social.hustle

class Creator {

    static hasMany = [events: Event, parties: Party]
    static belongsTo = [Event, Party]

    String name
    String url
    String code

    static constraints = {
        name blank:false
    }
}
