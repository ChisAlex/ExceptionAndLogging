import java.util.List;

public class StudentRepository {
    List<Student> students;

    public StudentRepository(List<Student> students){
        this.students = students;
    }

    public void addStudent(String firstName, String lastName, int dateOfBirth, String gender, String CNP){
        this.students.add(new Student (firstName, lastName, dateOfBirth, gender, CNP));
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void listStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void deleteStudent(String CNP) throws InvalidInputException {
        if(CNP.contentEquals("")){
            throw new InvalidInputException("ID is empty");
        }
        Student studentToBeDeleted = null;
        for (Student student: students){
            if(student.getCNP().equals(CNP)){
                studentToBeDeleted = student;
                break;
            }
        }

        if(studentToBeDeleted != null){
            students.remove(studentToBeDeleted);
        }
    }
}
