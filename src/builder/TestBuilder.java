package builder;

class TestBuilder {
    public static void main(String[] args) {

        Person employee = new Person.PersonBuilder("Alex","King","male",50)
                .setMiddleName("Sapr")
                .setAddress("Moskow")
                .setCountry("uru")
                .build();
    }
}
