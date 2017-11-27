package sdpcontent

class ShowSdpContentController {

    def ShowContent() {
        def persons = new ArrayList<Person>()
        for (int i = 0; i <= 10; i++) {
            Person person = new Person()
            person.lastName = "mansoubi"
            person.firstName = "anahid"
            person.age = i
            persons.add(person)
        }
        [persons: persons]
    }

    class Person {
        String lastName
        String firstName
        String age
    }
}
