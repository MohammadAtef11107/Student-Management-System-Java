import java.util.ArrayList;

public class Fasl {
        String name;
        Course subject ;
        int level;

        Instructor instructor;
        ArrayList<Student> stuList=new ArrayList<>();
        //----------------------------------------------------------------
        Fasl (String name, Course subject, int level, Instructor instructor) {
            this.subject = subject;
            this.level = level;
            this.instructor = instructor;
            this.name=name;
        }
//---------------------------------------------------------------------------

        void addStudent(Student student){
            this.stuList.add(student);
        }


        void removeStudent(Student student){
            for (int i = 0; i <stuList.size() ; i++) {
                if(stuList.get(i).id==student.id){
                    stuList.remove(i);
                    return;
                }
            }
            System.out.println("not found");
        }
    }