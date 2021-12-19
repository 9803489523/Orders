package Kazakov.L2;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String fatherName;
    private String gender;
    private String faculty;
    private int number_of_course;
    private String number_of_group;
    private int[] scores;
    private String city;

    public Student(String name, String surname, String fatherName, String gender, String faculty, int number_of_course,String number_of_group, int[] scores, String city) {
        this.surname = name;
        this.name = surname;
        this.fatherName = fatherName;
        this.gender = gender;
        this.faculty = faculty;
        this.number_of_course = number_of_course;
        this.number_of_group = number_of_group;
        this.scores = scores;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getNumber_of_course() {
        return number_of_course;
    }

    public void setNumber_of_course(int number_of_course) {
        this.number_of_course = number_of_course;
    }

    public String getNumber_of_group() {
        return number_of_group;
    }

    public void setNumber_of_group(String number_of_group) {
        this.number_of_group = number_of_group;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("\n%s %s %s, %s, %s оценки: %s", surname, name, fatherName, faculty, number_of_group, Arrays.toString(scores));
    }

    boolean isExcellent(){
        return Arrays.stream(scores).sum() / scores.length == 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number_of_course == student.number_of_course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(fatherName, student.fatherName) && Objects.equals(gender, student.gender) && Objects.equals(faculty, student.faculty) && Objects.equals(number_of_group, student.number_of_group) && Arrays.equals(scores, student.scores) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, fatherName, gender, faculty, number_of_course, number_of_group, city);
        result = 31 * result + Arrays.hashCode(scores);
        return result;
    }

    @Override
    public int compareTo(Student o) {
        if(o.surname.equals(surname))
            return this.name.compareTo(o.name);
        else
            return this.surname.compareTo(o.surname);
    }
}
