package programaniya.generics;

public class Main {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 14);
        Schoolar schoolar2 = new Schoolar("Petr", 15);
        Schoolar schoolar3 = new Schoolar("Marina", 16);
        Schoolar schoolar4 = new Schoolar("Olga", 12);
        Student student1 = new Student("Alex", 18);
        Student student2 = new Student("Dmitriy", 19);
        Employee employee1 = new Employee("Vasiliy", 50);
        Employee employee2 = new Employee("Andrey", 40);

        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipiant(schoolar1);
        schoolarTeam.addNewParticipiant(schoolar2);
        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipiant(student1);
        studentTeam.addNewParticipiant(student2);
        Team<Employee> employeeTeam = new Team<>("Zavod");
        employeeTeam.addNewParticipiant(employee1);
        employeeTeam.addNewParticipiant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Sun");
        schoolarTeam2.addNewParticipiant(schoolar3);
        schoolarTeam2.addNewParticipiant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
