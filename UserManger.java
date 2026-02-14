import java.util.ArrayList;
import java.util.Scanner;


public class UserManger {
    static Scanner sc=Input.sn;
    public static ArrayList<Student> studentsDatabase = new ArrayList<Student>();
    private static ArrayList<Instructor> instructorDatabase = new ArrayList<Instructor>();


    public static Student createStudent(){
        System.out.println("enter the name of the student you want to create");
        String name=sc.nextLine();
        System.out.println("enter the level of the student you want to create");
        int level=sc.nextInt();
        int id = studentsDatabase.size()+1;
        Student student = new Student(name,id,level);
        studentsDatabase.add(student);
        return student;
    }

    public static Instructor createInstructor(){
        System.out.println("enter the name of the teacher you want to create");
        String name=sc.nextLine();

        System.out.println("enter the specialization course of the teacher you want to create");
        CourseManger.previewCourses();
        int course_id=sc.nextInt();
        
        int id = instructorDatabase.size()+1;
        Instructor instructor = new Instructor(name,id,CourseManger.getCourses().get(course_id+1));
        instructorDatabase.add(instructor);
        return instructor;
    }

    public static Student getStudent(int id){
        for (int i = 0; i <studentsDatabase.size() ; i++) {
            if(studentsDatabase.get(i).id==id){
                return studentsDatabase.get(i);
            }
        }
        System.out.println("not found");
        return null;
    }

    public static Instructor getInstructor(int id){
        for (int i = 0; i <instructorDatabase.size() ; i++) {
            if(instructorDatabase.get(i).id==id){
                return instructorDatabase.get(i);
            }
        }
        System.out.println("not found");
        return null;
    }

    ArrayList<Student> getStudents(){
        return  studentsDatabase;
    }
    ArrayList<Instructor> getInstructors(){
        return  instructorDatabase;
    }

    public static void previewStudents(){
System.out.println("--------------------------------------------");
System.out.println("All Students");
System.out.println("--------------------------------------------");
if (studentsDatabase.size()!=0){
        for(int i =0; i<studentsDatabase.size();i++){
            System.out.println((i+1)+"- "+studentsDatabase.get(i));
            System.out.println("--------------------------------------------");
        }}else{
            System.out.println("empty");
        }
        System.out.println("--------------------------------------------");
    }
    public static void previewInstructors(){
        System.out.println("--------------------------------------------");
        System.out.println("All instructors");
        System.out.println("--------------------------------------------");
        if (instructorDatabase.size()!=0){
        for(int i =0; i<instructorDatabase.size();i++){
            System.out.println((i+1)+"- "+instructorDatabase.get(i));
            System.out.println("--------------------------------------------");
        }}else{
            System.out.println("empty");
        }
        System.out.println("--------------------------------------------");
        
    }
    public static void removeStudent(){
        System.out.println("enter the student id");
        int id = Input.sn.nextInt();
        Input.sn.nextLine();
        
        for (int i = 0; i <studentsDatabase.size() ; i++) {
            if(studentsDatabase.get(i).id==id){
                studentsDatabase.remove(i);
                return;
            }

        }
        System.out.println("not found");
    }

}
