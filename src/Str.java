import java.util.*;
import java.lang.*;
public class Str {
    public static void main(String[] args) {
        String a,b,c;
        Scanner s = new Scanner(System.in);
        a=s.nextLine();
        b=s.nextLine();
        System.out.println("length of string "+a.length());
        System.out.println("length of second string "+b.length());
        System.out.println("concatenation "+(a+b));
        if(a==b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        StringBuffer sb = new StringBuffer(a);
        sb.reverse();
        System.out.println("reverse of string "+sb);
    }
}
