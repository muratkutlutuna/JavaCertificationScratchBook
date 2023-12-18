package ocp.lukapopov.beyondclasses.records;

/**
 * @implNote There is a simpler way ==>"compact constructor
 * @param firstName
 * @param lastName
 * @param id
 */
public record StudentCompactConstructor(String firstName, String lastName, int id) {
    public StudentCompactConstructor{// notice the syntax no "()" parenthesis
        if (id<10||id>1_000_000)throw new IllegalArgumentException();
        //instance field don't need to be explicitly initialized
    }
}


/**
 * @implNote compact constructor could contain any business logic, e.g.
 * @param firstName
 * @param lastName
 * @param id
 */
record StudentCompactConstructor2(String firstName, String lastName, int id) {
    public StudentCompactConstructor2{
        if (id<10||id>1_000_000)throw new IllegalArgumentException();
        firstName = firstName.substring(0, 1).toUpperCase()
                + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase()
                + lastName.substring(1).toLowerCase();
    }
}

