package Kazakov.L2;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("St.txt");
        Scanner scanner = new Scanner(file);
        try {
            ListOfCourse courses = new ListOfCourse();
            String check = "";
            while (scanner.hasNext()) {
                check = scanner.nextLine();
                if (!check.isEmpty())
                    courses.add(new Student(check, scanner.nextLine(), scanner.nextLine(),
                            scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
                            scanner.nextLine(), arrConverter(scanner.nextLine()),
                            scanner.nextLine()));

            }
            courses.getTreeSet().sort(new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    return o1.compareTo(o2);
                }
            });
            System.out.println(courses);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
        public static int[] arrConverter (String string){
            String[] arr = string.split("");
            int[] intArr = new int[arr.length];
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(arr[i]);
            }
            return intArr;
        }
    }
