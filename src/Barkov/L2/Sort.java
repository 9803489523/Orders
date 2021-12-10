package Barkov.L2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
    private Set<Student> studentsWithDuty;
    private List<Student> students;

    public Sort() {
        studentsWithDuty =new TreeSet<>();
        students=new LinkedList<>();
    }
    public void add(Student student){
        if(student.hadDuty()) {
            student.setFatherName(student.getFatherName()+"*****");
            studentsWithDuty.add(student);
        }
        else
            students.add(student);
    }
    public void joinTwoCollections(){
        List<Student> list=new LinkedList<>(studentsWithDuty);
        list.addAll(students);
        System.out.println(list);
    }
}
