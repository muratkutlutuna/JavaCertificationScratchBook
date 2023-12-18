package ocp.lukapopov.beyondclasses.records;


/**
 * @implNote We can override auto-generated constructor
 *           this is called "canonical constructor"
 * @param firstName
 * @param lastName
 * @param id
 */
public record StudentAutoGeneratedCanonicalConstructor(String firstName, String lastName, int id) {
    public StudentAutoGeneratedCanonicalConstructor(String firstName, String lastName, int id){
        if (id<10||id>1_000_000)throw new IllegalArgumentException();
        this.firstName=firstName;
        this.lastName=lastName;
        this.id = id;
    }
}
