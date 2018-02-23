public class Threadtest extends Thread{
    //example for thread by extending thread class..
    public void run(){
        System.out.println("Thread is running....");
    }
    public static void main(String []args){
        Threadtest tt = new Threadtest();
        tt.start();
    }
}