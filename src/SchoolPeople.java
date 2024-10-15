import java.util.ArrayList;
import java.util.List;

//Create SchoolPeople Interface which have printJobDescription, printPeople, addPerson, removePerson, executeJob functions.
//
//Create SchoolWorker abstract class implement SchoolPeople
//implement necessarry functions from interface and create required fields
//
//Create SchoolStudent abstract class implement SchoolPeople
//implement necessarry functions from interface and create required fields
//
//Create Person class without inheriting anything and have basic person information(then you will store person list in the abstract classes)
//
//
//Create FirstGradeStudents extends SchoolStudent
//implement necessarry functions from abstract class and create required fields
//
//Create  SchoolCleaners extends SchoolWorker
//implement necessarry functions from abstract class and create required fields
//
//Create  SchoolTeachers extends SchoolWorker
//implement necessarry functions from abstract class and create required fields
//
//Write your main class to have 1 FirstGradeStudents, 1 SchoolCleaners  and 1 SchoolTeachers
//
//also create 15 people and assign these people to classes.
public interface SchoolPeople {
    void printJobDescription();
    void printPeople();
    void addPerson();
    void removePerson();
    void excecuteJob();

    void printJobDescription(String name, String address, String jobTitle, String jobDescription);

    void printJobDescription(String name, String address, String jobTitle);
}

abstract class SchoolWorker implements SchoolPeople {


    @Override
    public void printJobDescription(String name, String address, String jobTitle, String jobDescription) {

        System.out.println(name + "works as " + jobTitle + jobDescription);


    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void printJobDescription() {

    }

    @Override
    public void printPeople() {

    }

    @Override
    public void addPerson() {

    }

    @Override
    public void removePerson() {

    }

    @Override
    public void excecuteJob() {

    }

    @Override
    public void printJobDescription(String name, String address, String jobTitle) {

    }
}

abstract class SchoolStudent implements SchoolPeople {
    @Override
    public void printJobDescription() {

    }

    @Override
    public void printPeople() {

    }

    @Override
    public void addPerson() {

    }

    @Override
    public void removePerson() {

    }

    @Override
    public void excecuteJob() {

    }

}
class SchoolCleaners extends SchoolWorker{
    @Override
    public void printJobDescription() {
        super.printJobDescription();
    }

    @Override
    public void printPeople() {
        super.printPeople();
    }

    @Override
    public void addPerson() {
        super.addPerson();
    }

    @Override
    public void removePerson() {
        super.removePerson();
    }

    @Override
    public void excecuteJob() {
        super.excecuteJob();
    }
}



class Person {
    String name;
    String address;
    int age;
    String jobTitle;
    String jobDescription;



    public void SchoolPeople(String name, String address, int age, String jobTitle, String jobDescription) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;

    }
}
//Create FirstGradeStudents extends SchoolStudent
////implement necessarry functions from abstract class and create required fields
class FirstGradeStudents extends SchoolStudent {
    String Grade;

    public FirstGradeStudents(String grade) {
        Grade = grade;
    }

    @Override
    public void printJobDescription(String name, String address, String jobTitle, String jobDescription) {

    }

    @Override
    public void printJobDescription(String name, String address, String jobTitle) {

    }
}

//  Create  SchoolCleaners extends SchoolWorker
//implement necessarry functions from abstract class and create required fields





