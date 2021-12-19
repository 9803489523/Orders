package Kazakov.L2;

import java.util.Set;
import java.util.TreeSet;

public class Course implements Comparable<Course>{
    private Set<Student> course;
    private int numberOfCourse;

    public Set<Student> getCourse() {
        return course;
    }

    public void setCourse(Set<Student> course) {
        this.course = course;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public Course(Student student) {
        course=new TreeSet<>();
        course.add(student);
        numberOfCourse=student.getNumber_of_course();
    }

    public int numberOfExcellent(){
        int counter=0;
        for(Student student:course){
            if(student.isExcellent())
                counter++;
        }
        return (int) ( 100*counter*1.0/course.size());
    }
    public void add(Student student){
        if(student.getNumber_of_course()==numberOfCourse)
            course.add(student);
    }

    @Override
    public String toString() {
        return String.format("\n\t%s курс, процент отличников: %s %%, студенты: %s",numberOfCourse,numberOfExcellent(),course);
    }

    @Override
    public int compareTo(Course o) {
        return Double.compare(o.numberOfExcellent(),this.numberOfExcellent());
    }
}
