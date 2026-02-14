import java.util.ArrayList;
import java.util.Scanner;


public class Attendance extends UserManger {
    static Scanner sc = Input.sn;
   static ArrayList<String> attendance = new ArrayList<>(studentsDatabase.size());


    public static void defultAttendance() {
        for (int i = 0; i < studentsDatabase.size(); i++) {
            attendance.add("Absent");
        }

    }


    public static void assignAttendance() {
       if (studentsDatabase.size() == 0) {
           System.out.println("No Student In The Class ");
       }
       else {
           for (int i = 0; i < studentsDatabase.size(); i++) {
               System.out.println("Take Attendance of " + studentsDatabase.get(i) + " \n to attend");
               System.out.println("write (t) to attend or Write (f) to absent");
               boolean flag = false;
               String tORf = sc.nextLine();
               if (tORf.equals("t") || tORf.equals("T")) {
                   flag = true;
               } else if (tORf.equals("f") || tORf.equals("F")) {
                   flag = false;
               } else {
                   System.out.println("Attendance Error......please write (t) or (f)");
                   i--;
                   continue;
               }

               if (flag == true) {
                   attendance.set(i, "is Attended");
               } else {
                   attendance.set(i, "is Absent");
               }

           }
       }
    }



    public static void previewAttendance() {
        for (int i = 0; i < studentsDatabase.size(); i++) {
            System.out.println(studentsDatabase.get(i)+" ----------------------> "+attendance.get(i));

        }
    }





}