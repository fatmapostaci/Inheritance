package inheritance;

/**
 * Engineer.java: Human classından inherit edildi.
 * @String field( Mühendislik alanı) ve proje tipi
 * @String projectType (Proje türü)
 * özelleştirilmiş bir introduceYourself metodu var
 */
public class Engineer extends Human{

    private  String projectType;
    private String field;

    public Engineer(String name, double salary,String field, String projectType) {
        super(name,salary);
        this.projectType = projectType;
        this.field = field;
    }

    @Override
    public String introduceYourself(){
        return "\nMy name is " + name + ", I work as an " + field + " . I am " + projectType +"." ;
    }

    @Override
    public String toString() {
        return "Engineer-> " +
                " Adı = " + name + " , " +
                " Yaşı = " + age + " , " +
                " Uzmanlık Alanı = " + field +
                " Çalıştığı Proje = " + projectType ;
    }
}
