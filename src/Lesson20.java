public class Lesson20 {
    public static void main(String[] args) {
        Human human = new Human();

    }
}
    class Human{
        private String name;
        private int age;

    public Human() {
        this.name = " nnnn ";
        this.age = 0;
    }
    public Human(String name){
        System.out.println("Hi from second construction");
        this.name = name;
    }
        public Human(String name, int age) {
            System.out.println("Hi from theard construction");
            this.name = name;
            this.age = age;
        }
        public void setName (String name) {this.name = name;}
        public void setAge (int age) {this.age = age;}


    }
