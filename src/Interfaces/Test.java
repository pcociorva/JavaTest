package Interfaces;

public class Test {
    public static void main(String[] args) {
         Info info1 = new Animals(1);
         Info info2 = new Person("Bob");
         info1.showInfo();
         info2.showInfo();

        }

    public static void outputInfo(Info info) {
        info.showInfo();

    }
    }
