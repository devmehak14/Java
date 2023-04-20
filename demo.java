// if class is public then class name and file name should be same
public class demo{

    public static void main(String[] args) {

        int x=12;
        float y=12.06f;
        char ch ='a';
        boolean flag = true;

        byte a =12;         // value of a can be from -128 to 127, from 128 it will give error(bade data type ko store in chote data type)
        System.out.println(a);

        // ln --> introduce escape sequence (next line)itself
        System.out.print("Hello");
        System.out.println(" world");

        byte b= 65;             // 65 --> ASCII Value of 'A'
        System.out.println((char)b);

    }
}