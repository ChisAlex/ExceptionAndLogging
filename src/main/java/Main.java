import javax.sound.midi.Soundbank;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;




public class Main {
   // private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InvalidInputException {
        Scanner input = new Scanner(System.in);

        StudentRepository studentRepository = new StudentRepository(new ArrayList<Student>());

        try {
            //student.addStudent("a", "b", 1, "m","fr3");
//LOGGER.info("test" + "");
            System.out.println("Enter first name:");
            String firstName = input.nextLine();
            if(firstName.contentEquals("")){
                throw new InvalidInputException("First name is empty");}
            System.out.println("Enter last name:");
            String lastName = input.nextLine();
                if(lastName.contentEquals("")){
                    throw new InvalidInputException("Last name is empty");}
            System.out.println("Enter your date of birth:");
            int dateOfBirth = Integer.valueOf(input.nextLine());
                    if((dateOfBirth<=1900)||(dateOfBirth>=2018)){
                        throw new InvalidInputException("Date of birth is empty");}
            System.out.println("Enter your gender:");
            String gender = input.nextLine();
                        if(gender.contentEquals("")){
                            throw new InvalidInputException("Gender is empty");}
            System.out.println("Enter your CNP:");
            String CNP = input.nextLine();
                            if(CNP.contentEquals("")){
                                throw new InvalidInputException("CNP is empty");}

            Student newStudent = new Student(firstName, lastName, dateOfBirth, gender, CNP);

            studentRepository.addStudent(newStudent);

        } catch(Exception e) {
            System.out.println("You can't do that");
        }

        studentRepository.listStudents();
        studentRepository.deleteStudent("");







    }
}
