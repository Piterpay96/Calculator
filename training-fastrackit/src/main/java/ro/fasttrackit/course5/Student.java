package ro.fasttrackit.course5;

public class Student implements Human {
    static int dateOfEnrollment;
    String facultyName;
    String specializationName;

    public static int getDateOfEnrollment () {
        return dateOfEnrollment;
    }

    public static void setDateOfEnrollment () {
        Student.dateOfEnrollment = dateOfEnrollment;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String name) {
        this.facultyName = name;
    }

    public String getSpecializationName () {
        return specializationName;
    }

    public void setSpecializationName (String name) {
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
