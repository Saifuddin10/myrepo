public class Shaik {
    int x=90;
    int y=89;
    int z=78;


    void setdata() {
        this.x = 25;
        this.y = 10;
    }
        void printsum()
    {
            this.z = this.x + this.y;
            System.out.println(this.z);
        }
        void printsub()
    {
            this.z = this.x - this.y;
            System.out.println(this.z);
        }
        void printdiv ()
    {
            this.z = this.x / this.y;
            System.out.println(this.z);
        }
        public static void main (String[] args){
            Shaik b2 = new Shaik();
            b2.setdata();
            b2.printsum();
            b2.printsub();
            b2.printdiv();

        }
    }
