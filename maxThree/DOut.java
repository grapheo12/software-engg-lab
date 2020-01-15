import java.io.*;

class DOut{
    public static void main(String[] args){
        try{
            DataOutputStream dout = new DataOutputStream(new FileOutputStream("in.txt"));

            dout.writeInt(1);
            dout.writeInt(2);
            dout.writeInt(3);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
