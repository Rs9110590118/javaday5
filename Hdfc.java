
class Parent {
    void name() {
        System.out.println("this is parent");
    }

    class Child1 extends Parent {
        Child1() {
            System.out.println("this is child1");
        }
    }

    class Child2 extends Parent {
        Child2() {
            System.out.println("this is child2");
        }
    }
}

class Hdfc {
    public static void main(String[] args) {

        Parent p = new Parent();

        Parent.Child1 ch1 = p.new Child1();
        ch1.name();

        Parent.Child2 ch2 = p.new Child2();
        ch2.name();
    }
}
