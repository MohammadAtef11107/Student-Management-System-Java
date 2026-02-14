import java.util.ArrayList;

public class CourseManger {

    private static ArrayList<Course> courseDatabse = new ArrayList<Course>();
    private static ArrayList<Fasl> faslDatabse = new ArrayList<Fasl>();
    public static ArrayList<Course> getCourses(){
        return courseDatabse;
    }

    public static void previewCourses(){
        System.out.println("--------------------------------------------");
        System.out.println("available courses");
        System.out.println("--------------------------------------------");
        if (courseDatabse.size()!=0){
        for(int i=0;i<courseDatabse.size();i++){
            System.out.println((i+1)+"- "+courseDatabse.get(i).subject);
            System.out.println("--------------------------------------------");
        }}else{
            System.out.println("empty");
        }
        System.out.println("--------------------------------------------");
        
    }

    public static void previewClasses(){
        System.out.println("--------------------------------------------");
        System.out.println("available classes");
        System.out.println("--------------------------------------------");
        if (faslDatabse.size()!=0){
        for(int i=0;i<faslDatabse.size();i++){
            
            System.out.println((i+1)+"- "+"name: "+faslDatabse.get(i).name+"\nlevel: "+faslDatabse.get(i).level+"\nsubject: "+faslDatabse.get(i).subject);
            System.out.println("--------------------------------------------");
        }}else{
            System.out.println("empty");
        }
        System.out.println("--------------------------------------------");
    }

    public static Course createCourse(){
        System.out.println("enter the subject name: ");
        String name = Input.sn.nextLine();
        
        System.out.println("enter the level of the course: ");
        int level = Input.sn.nextInt();
        Input.sn.nextLine();

        Course course = new Course(name, level );
        return course;
    }

    public static Fasl createFasl(){
        System.out.println("enter the Class name: ");
        String name = Input.sn.nextLine();
        
        System.out.println("enter the subject of the class: ");
        previewCourses();
        int sub = Input.sn.nextInt();
        Input.sn.nextLine();

        System.out.println("enter the level of the class: ");
        int level = Input.sn.nextInt();
        Input.sn.nextLine();

        System.out.println("enter the instractor id of the class: ");
        int id = Input.sn.nextInt();
        Input.sn.nextLine();

        Fasl fasl = new Fasl(name, courseDatabse.get(sub), level ,UserManger.getInstructor(id));
        faslDatabse.add(fasl);

        return fasl;
    }

}
