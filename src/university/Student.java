package university;

public class Student {

    private long id;
    private String Surname;
    private String Name;
    private String Otchestvo;
    private int year;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;


    public Student() {
    }


    public Student(long id, String surname, String name, String otchestvo, int year, String faculty, int course, String group) {
        this.id = id;
        this.Surname = surname;
        this.Name = name;
        this.Otchestvo = otchestvo;
        this.year = year;
        this.address = "default address";
        this.phoneNumber = "default phoneNumber";
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public Student(long id, String surname, String name, String otchestvo, int year, String address, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.Surname = surname;
        this.Name = name;
        this.Otchestvo = otchestvo;
        this.year = year;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOtchestvo() {
        return Otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        Otchestvo = otchestvo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", Otchestvo='" + Otchestvo + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}


