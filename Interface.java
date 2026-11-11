interface Rbi{
    void amount();

}
class Sbi implements Rbi{
    public void amount(){
        System.out.println("amount is nill");
    }
}
class Interface{
    public static void main(String[]args){
        Sbi sb=new Sbi();
        sb.amount();
    }
}