class Grandparents{
    void name(){
        System.out.println("this is parent");
    }
class Parents extends Grandparents{
    Parents(){
         System.out.println("this is child");

    }
}
class Child extends Parents{
    Child(){
         System.out.println("this is child");
    }
}

}
class Mult{
    public static void main(String[]args){
        Child ch=new Child();
        ch.name();
    }
}