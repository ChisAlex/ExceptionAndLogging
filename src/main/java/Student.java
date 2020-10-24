import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int dateOfBirth;
    String gender;
    String CNP;

    public Student(String firstName, String lastName, int dateOfBirth, String gender, String CNP){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.CNP = CNP;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCNP() {
        return CNP;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", CNP='" + CNP + '\'' +
                '}';
    }
}

