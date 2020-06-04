public class Lesson25 {
    public static void main(String[] args) {
       Man m1 = new Man("Bob",40);
        System.out.println(m1.toString());

    }
}
class Man{
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + "," + age;
    }
}