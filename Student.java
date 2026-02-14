public class Student extends Users {
   int level;

    Student (String name, int id, int level) {
        super(name,id);
        this.level=level;
    }


    @Override
    public String toString() {
        return "student name: "+this.name+ "\nstudent id: "+this.id+"\nstudent level: "+this.level;
    }

}
