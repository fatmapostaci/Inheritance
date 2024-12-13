package inheritance;

public class Teacher extends Human {
    private final String branch;
    private int yearsOfExperience;

    public Teacher(String name, String branch, double salary) {
        super(name,salary);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "{" +

                ", name='" + name + '\'' +
                ", age=" + age +
                "branch='" + branch + '\'' +
                '}';
    }
    public void doHomework(){

    }
    public void gatherSchoolCommision() {

    }

//?????**bu methodu neden static yapması gerekti??????????
    public static class PrimarySchoolTeacher extends Teacher {

        private final boolean bilsemCounselorTeacher;


        public PrimarySchoolTeacher(String name, String branch, double salary, boolean bilsemCounselorTeacher) {
            super(name, branch,salary);
            this.bilsemCounselorTeacher = bilsemCounselorTeacher;

        }

        public void gatherBilsemCommision(Student_PrimarySchool std) {
            //bilsem öğretmeni ise öğrencinin bilseme onayını verebilsin
            if(bilsemCounselorTeacher){
                System.out.printf( "%s öğretmen %s in bilseme girmesini onayladı.\n",name,std.getName());
                std.setJoinedBilsemExam(true);

            }

        }
    }





}
