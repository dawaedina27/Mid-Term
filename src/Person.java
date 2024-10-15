package Mid_Term;

import java.util.ArrayList;
import java.util.List;

//Create Mid_Term.SchoolPeople Interface which have printJobDescription, printPeople, addPerson, removePerson, executeJob functions.
//
//Create Mid_Term.SchoolWorker abstract class implement Mid_Term.SchoolPeople
//implement necessarry functions from interface and create required fields
//
//Create Mid_Term.SchoolStudent abstract class implement Mid_Term.SchoolPeople
//implement necessarry functions from interface and create required fields
//
//Create Mid_Term.Person class without inheriting anything and have basic person information(then you will store person list in the abstract classes)
//
//
//Create FirstGradeStudents extends Mid_Term.SchoolStudent
//implement necessarry functions from abstract class and create required fields
//
//Create  Mid_Term.SchoolCleaners extends Mid_Term.SchoolWorker
//implement necessarry functions from abstract class and create required fields
//
//Create  Mid_Term.SchoolTeachers extends Mid_Term.SchoolWorker
//implement necessarry functions from abstract class and create required fields
//
//Write your Mid_Term.main class to have 1 FirstGradeStudents, 1 Mid_Term.SchoolCleaners  and 1 Mid_Term.SchoolTeachers
//
//also create 15 people and assign these people to classes.

class main {
    public static void main(String[] args){
        FirstGradeStudents grades = new FirstGradeStudents();
        SchoolCleaners schoolCleaners = new SchoolCleaners();
        SchoolTeachers schoolTeachers = new SchoolTeachers();

        List<String> people = new ArrayList<String>();
        for (int i = 1; i <=5; ){
            people.add(new Person("Mid_Term.Person " + i, 10 + i));
        }
        for (int i = 0; i <= 5; i++){
            grades.addPerson(people.get(i));
            SchoolCleaners.addPerson(people.get(i + 5));
            SchoolTeachers.addPerson(people.get(i + 10));

        }

        grades.printjobDescription();
        grades.printPeople();
        grades.executeJob();

        System.out.println();

        schoolTeachers.printJobDescription();
        schoolTeachers.printPeople();
        schoolTeachers.executeJob();

        System.out.println();

        schoolCleaners.printJobDescription();
        schoolCleaners.printPeople();
        schoolCleaners.executeJob();

        System.out.println();

    }
}



public class Person {
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

    public String getJobTitle() {
        return jobTitle;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getJobDescription(){
        return jobDescription;
    }
    public int getAge(){
        return age;
    }
}

interface SchoolPeople {
    void printJobDescription(String name, String address, String jobTitle, String jobDescription);

    void executeJob();

    void printJobDescription();
    void printPeople();
    void addPerson(Person person);
    void removePerson(Person person);

}

abstract class SchoolWorker implements SchoolPeople {
    protected List<Person> people = new ArrayList<Person>();
    protected String jobTitle;


    @Override
    public void removePerson(Person person) {
        people.remove(person);

    }


    @Override
    public void addPerson(Person person) {
        people.add(person);

    }

    @Override
    public abstract void printJobDescription();

    @Override
    public abstract void executeJob();
    @Override
    public void printPeople() {
        System.out.println(jobTitle + " Teacher ");
        for(Person person : people){
            System.out.println(person);
        }

    }
}


abstract class SchoolStudent implements SchoolPeople {
    protected String performance;
    protected List<Person> people = new ArrayList<Person>();

    @Override
    public void removePerson(Person person) {
        people.remove(person);

    }

    @Override
    public void addPerson(Person person) {
        people.add(person);

    }

    @Override
    public abstract void printJobDescription();

    @Override
    public abstract void executeJob();

    @Override
    public void printPeople() {
        System.out.println(performance + " Student ");
        for (Person person : people) {
            System.out.println(person);
        }

    }
class SchoolCleaners extends SchoolWorker {
        @Override
        public void removePerson(Person person) {
            super.removePerson(person);
        }

        @Override
        public void addPerson(Person person) {
            super.addPerson(person);
        }

        @Override
        public void printJobDescription() {

        }

        @Override
        public void executeJob() {

        }

        @Override
        public void printPeople() {
            super.printPeople();
        }
    }

    //Create FirstGradeStudents extends Mid_Term.SchoolStudent
////implement necessary functions from abstract class and create required fields
    abstract class FirstGradeStudents extends SchoolStudent {
        String Grade;

        public FirstGradeStudents(String grade) {
            Grade = grade;
        }

        @Override
        public void removePerson(Person person) {
            super.removePerson(person);
        }

        @Override
        public void addPerson(Person person) {
            super.addPerson(person);
        }

        @Override
        public void printJobDescription() {
            System.out.println("First Grade students are very attentive in class");

        }

        @Override
        public void executeJob() {
            System.out.println("The first grade students are complete their assignments");

        }

        @Override
        public void printPeople() {
            super.printPeople();
        }
    }
}
//Create  Mid_Term.SchoolCleaners extends Mid_Term.SchoolWorker
//implement necessarry functions from abstract class and create required fields
class SchoolCleaners extends SchoolWorker {
    public SchoolCleaners(){
        this.jobTitle = "School Cleaners";
    }

    @Override
    public void printJobDescription() {
        System.out.println("School Cleaners clean the school")

    }


    @Override
    public void executeJob() {
        System.out.println("The school Cleaners always complete their cleaning assignments");
    }
}

class SchoolTeachers extends SchoolWorker {
    public SchoolTeachers() {
        this.jobTitle = "Mid_Term.SchoolTeachers";

    }

    @Override
    public void printJobDescription() {
        System.out.println("The school Teachers help in educating the pupils.");

    }

    @Override
    public void executeJob() {
        System.out.println("The school Teachers teaches pupils.");


    }
}









