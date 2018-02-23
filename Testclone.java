import java.io.Serializable;
//contains clonable interface used to clone the object
//example for MARKER interface
class A implements Cloneable{
    int i;
    String s;
    public A(int i, String s){
        this.i = i;
        this.s = s;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
 public class Testclone{
     public static void main(String[] args) throws CloneNotSupportedException {
         A a = new A(21, "Venkatesh");
         A b = (A)a.clone();
         System.out.println(b.i);
         System.out.println(b.s);
         
     }
 }