package inheritance;

public class Student_HighSchool extends Student {
    private int grade;
    /**
     * Represents a student in high school.
     * @param name Name of the student
     * @param id School ID of the student
     * @param schoolName Name of the school
     * @param grade Current grade level
     */
    public Student_HighSchool(String name, int id, String schoolName, int grade) {
        super(name, id, schoolName);
        this.grade = grade;
    }

    @Override
    public String introduceYourself() {
        return "\nMy name is " + name + " I am a " + grade + ". grade student in " + getSchoolName() + " . My school id is " + getId();
    }

    public void studyForYKS(){
        System.out.println(name + " is getting prepared for collage.");
    }
}
