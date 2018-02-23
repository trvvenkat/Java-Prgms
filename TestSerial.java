import java.io.*;
//example for MARKER interface
class A implements Serializable{
    int i;
    String s;
    public A(int i, String s){
        this.i = i;
        this.s = s;
    }
}

public class TestSerial{
    public static void main(String[] args) 
    throws IOException, ClassNotFoundException{
        A a = new A(21, "Venkatesh");
        // Serializing a...
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        //de-serializing a....

        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A b = (A)ois.readObject(); //down-casting object..

        oos.close();
        ois.close();
    }
}