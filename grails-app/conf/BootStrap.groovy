import social.hustle.Creator
import social.hustle.Event
import social.hustle.Party

class BootStrap {

    def init = { servletContext ->
        if(!Creator.count() && !Event.count() && !Party.count()) {
            Creator catie = new Creator(name: "Catie Donnelly", url: "http://catiemonstro.us", code: "aaaaa").save(failOnError: true)
            Creator jordan = new Creator(name: "Jodan Witt", url: "http://www.52nddoor.com", code: "bbbbb").save(failOnError: true)
            Creator tom = new Creator(name: "Tom McHenry", url: "http://www.noncanon.com", code: "ccccc").save(failOnError: true)
            Creator sara = new Creator(name: "Sara McHenry", url: "http://www.heypais.com", code: "ddddd").save(failOnError: true)
            Creator tony = new Creator(name: "Tony Breed", url: "http://www.noncanon.com", code: "eeeee").save(failOnError: true)

            Event heroes = new Event(name: "HeroesCon 2015", status:Event.EventStatus.PENDING)
            heroes.save(failOnError: true)

            Party party = new Party(name: "Beta Group", reward: "Special Reward Badge!", event: heroes)
            party.addToCreators(catie)
            party.addToCreators(jordan)
            party.addToCreators(tom)
            party.addToCreators(sara)
            party.addToCreators(tony)
            party.save(failOnError: true)
        }
    }
    def destroy = {
    }
}
