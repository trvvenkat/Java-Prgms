//simple Dependency injection..
interface Calc{
    double calculate(int a, int b);
}
class Mathh{
    Calc c1;
    double result;
    void setMath(Calc c1){
        this.c1 = c1;
    }
    double calci(int a, int b){
        result = c1.calculate(a, b);
        return result;
    }
}
class Addi implements Calc{
    public double calculate(int a, int b){
        return a+b;
    }
}
class Subi implements Calc{
    public double calculate(int a, int b){
        return a-b;
    }
}
public class DependencyInjection{
    public static void main(String []args){
        Calc c1 = new Addi();
        Calc c2 = new Subi();
        Mathh m1 = new Mathh();
        m1.setMath(c1);
        System.out.println(m1.calci(5, 6));
        m1.setMath(c2);
        System.out.println(m1.calci(5, 6));

    }
}