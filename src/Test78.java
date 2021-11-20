import jdk.swing.interop.SwingInterOpUtils;

//wrapper class
public class Test78 {
    public static void main(string[] args){
        Integer obj = Integer.valueof(45);
        Integer obj1 = Integer.valueof(60);
        System.out.println(obj==obj1);
    }
}
