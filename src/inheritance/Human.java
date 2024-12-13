package inheritance;


/**
 * Human.java: Temel sınıf, ad, yaş ve cinsiyet özellikleri içeriyor.
 * Ayrıca genel bir @overrided introduceYourself metodu var.
 * Bu sınıf diğer sınıflar tarafından extend ediliyor
 */
public class Human  {
    protected String name;
    protected int age;
    protected String gender;
    private double salary;

    public Human(String name) {
        //student classı inherited to this constructor
        this.name = name;
    }

    public Human(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Human() {
    }
    /**
     * Her subsclass kendi metniyle kendini tanıtır
     */
    public String introduceYourself(){
        return "My name is " + name + ", I am " + age + " years old.";
    }
    public void sleep(){
        System.out.printf( "%s sleeps. \n" , name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age > 0 ? age : -1; // Negatif veya sıfır yaş kontrolü

    }

    public void setAge(int age) {
        this.age = age;
    }
}
