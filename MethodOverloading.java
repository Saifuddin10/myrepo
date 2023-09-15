public class MethodOverloading {
    public void add (int a, int b) {
        System.out.println(a + b);
    }
    public void von (int a,int b,int c){
        System.out.println(a * b * c);
    }
    public void doub (double a,double b){
        System.out.println(a/b);
    }
    public void str (String a,String b){
        System.out.println(a+b);
    }
    public static void main (String[]args){
        MethodOverloading a3 = new MethodOverloading();
        a3.add(25,25);
        a3.von(2,5,6);
        a3.doub(25,5);
        a3.str("Shaik","Saif");

    }
}
