package myprogs;

 class Employe {
     int a ;
     static int id = 40;
     static int num = 52;

     void change() {
         System.out.println(id);
         System.out.println(num);

     }
 }




public class Company {
    public static void main(String[] args) {
        Employe a1 = new Employe();
        Employe a2 = new Employe();
        a1.change();
        Employe.id = 22;
        Employe.num = 45;
        a2.change();

    }
}

