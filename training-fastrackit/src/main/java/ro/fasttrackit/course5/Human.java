package ro.fasttrackit.course5;

public interface Human {
    String NAME = "random name";

    int dateOfEnrollment();

    String facultyName();

    default void specializationName() {

    }

}
