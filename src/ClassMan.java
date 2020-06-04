public class ClassMan {
    public static void main(String[] args) {

   Person person1 = new Person();
   person1.name = "Roma";
   person1.age = 35;
   person1.speak();
   person1.sayHello();

   Person person2 = new Person();
   person2.name = "Vasea";
   person2.age = 40;
   person2.speak();
   person2.sayHello();


    }
}
class Person{
    String name;
    int age;
    void speak(){
        for(int i=0; i<3; i++){
        System.out.println("My name is "+ name +","+"I have "+ age +" yers old");}
    }
    void sayHello(){
        for (int i=0; i<3; i++){
        System.out.println("Salut");}
    }
}