import java.io.*;

class DIStreamEx{
    public static void main(String[] args){
        try{
            DataInputStream din = new DataInputStream(new FileInputStream("input.txt"));
	    byte b[] = new byte[1000];
	    din.read(b);
	    int a[] = new int[3];
	    int k = 0;

	    StringBuilder buff = new StringBuilder();

	    for (byte c : b){
		if ((char)c == ' ' || (char)c == '\n'){
		    a[k++] = Integer.parseInt(buff.toString());
		    buff.setLength(0);
		}else
		    buff.append((char)c);
	    }
	    int maxValue = a[0];	    
	    for (int i = 0; i < 3; i++){
		if (a[i] > maxValue)
		    maxValue = a[i];
	    }
	    System.out.println("Max Value: " + maxValue);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
