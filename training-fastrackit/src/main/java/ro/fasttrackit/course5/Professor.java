package ro.fasttrackit.course5;

public class Professor  implements Human {
    static int dateOfHiring;
    String specializationName;

    public static int getDateOfEnrollment () {

        return dateOfHiring;
    }

    public static void setDateOfEnrollment () {

        Student.dateOfEnrollment = dateOfHiring;
    }

    public String getFacultyName() {

        return specializationName;
    }

    public void setFacultyName(String name) {

        this.specializationName = name;
    }

    @Override
    public int dateOfEnrollment() {
        return 0;
    }

    @Override
    public String facultyName() {
        return null;
    }

    @Override
    public void specializationName() {
        return ;
    }

}

