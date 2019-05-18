package university;

public class Application {


    public static void main(String[] args) {

        Student[] students = new Student[6];
        students[0] = new Student(1, "Ivanov", "Vasja", "Vasiljevich", 1988, "Physics", 2, "group1");
        students[1] = new Student(2, "Alexandrov", "Ivan", "Vladimirovich", 2000, "Programming", 1, "group3");
        students[2] = new Student(3, "Petrov", "Alexey", "Petrovich", 2008, "English", 3, "group2");
        students[3] = new Student(4, "Sidirov", "Dmitruy", "Igorivich", 1998, "Programming", 2, "group3");
        students[4] = new Student(5, "Smirnof", "Euvgeniy", "Germonovich", 1995, "English", 3, "group1");
        students[5] = new Student(5, "Simukin", "Andrey", "sergeevivh", 1990, "Physics", 1, "group2");


        String faculty = "English";
        int course = 3;
        int year = 1995;
        String group = "group2";
        System.out.println("Students of " + faculty + " faculty:");

        printStudentOfFaculty(students, faculty);
        printStudentOfFacultyAndCourse(students, faculty, course);
        printAgeOfStudents(students, year);
        printGroup(students, group);
    }

    public static void printStudentOfFaculty(Student[] students, String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i]);
            }
        }
    }

    public static void printStudentOfFacultyAndCourse(Student[] students, String faculty, int course) {

        for (int i = 0; i < students.length; i++) {
            System.out.println("students[i]="+students[i]);
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == (course)) {
                System.out.println(students[i]);
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }


    public static void printAgeOfStudents(Student[] students, int year) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYear() > year) {
                System.out.println(students[i]);
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public static void printGroup(Student[] students, String group) {
        for (int i = 0; i <students.length ; i++) {
            if (students[i].getGroup().equals(group)){
                System.out.println(students[i]);
            }

        }
    }
}
