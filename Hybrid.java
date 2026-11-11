class Grandparents{
    void name(){
        System.out.println("this is grand parent");
    }
}
class Parent extends Grandparents{
    Parent(){
        System.out.println("this is parent");

    }
}
class Child1 extends Parent{
    Child1(){
        System.out.println("this is child1");
    }
}
class Child2 extends Parent{
    Child2(){
        System.out.println("this is child2");
    }

}
class Hybrid{
    public static void main(String[]args){
        Child ch=new Child();
        ch.name();
    }
}