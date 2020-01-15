import java.io.*;

class DIStreamEx{
    public static void main(String[] args){
        try{
            DataInputStream din = new DataInputStream(new FileInputStream("in.txt"));

            int a = din.readInt();
            System.out.println(a);
            int b = din.readInt();
            int c = din.readInt();

            System.out.println("Entered values = [" + a + ", " + b + ", " + c + "]");
            System.out.println("Max value: " + Math.max(a, Math.max(b, c)));
            din.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
