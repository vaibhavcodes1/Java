package Java;

public class Calculator{
    public int add(int a ,int b){
        return a+b;
    }
    public int sub (int a, int b){
        return a-b;
    }
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int add_ress = cal.add(4,5);
        int sub_ress = cal.sub(10,5);
        System.out.println("Addition: "+add_ress);
        System.out.println("Subtraction: "+sub_ress);
    }
}