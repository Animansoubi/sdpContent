package sdpcontent

class ShowSdpContentController {

    def ShowContent() {

        def p = new Person(firstName: "anahid", age: 29, lastName: "mansoubi")
        p.save()

        def p1 = new Person(firstName: "mohammd", age: 29, lastName: "moradyar")
        p1.save()
        def query = Person.findAll()

        [query:query]
//        def book = Person.findByFirstName("anahid")

//        def persons = new ArrayList<Person>()
//        for (int i = 0; i <= 10; i++) {
//            Person person = new Person()
//            person.lastName = "mansoubi"
//            person.firstName = "anahid"
//            person.age = i
//            persons.add(person)

        }
//        [persons: persons]

    }
//}
