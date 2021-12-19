package Kazakov.L2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListOfCourse {
    private List<Course> treeSet;

    public void setTreeSet(List<Course> treeSet) {
        this.treeSet = treeSet;
    }

    public List<Course> getTreeSet() {
        return treeSet;
    }

    public ListOfCourse(Student student) {
        treeSet=new ArrayList<>();
        treeSet.add(new Course(student));
    }

    public ListOfCourse() {
        treeSet=new ArrayList<>();
    }

    public void add(Student student){
            for (Course course : treeSet) {
                if (student.getNumber_of_course() == course.getNumberOfCourse()) {
                    course.add(student);
                    return;
                }
            }
            treeSet.add(new Course(student));

    }

    @Override
    public String toString() {
        return treeSet.toString();
    }
}
