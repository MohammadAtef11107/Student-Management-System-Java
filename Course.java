import java.util.*;

public class Course {

    String subject ;
    int level;

//----------------------------------------------------------------
    Course (String subject, int level) {
        this.subject = subject;
        this.level = level;
    }
//---------------------------------------------------------------------------

    @Override
    public String toString(){
        return "subject name: "+this.subject;
    }
}
