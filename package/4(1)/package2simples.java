package simple2pack;
import simple2pack.sub2pack.*;
public class package2 {

    public static void main(String[] args) {
        System.out.println("in simple package 2");
        System.out.println("accessing sub package of simplepackage 2");
        sub2pack obj=new sub2pack();
        obj.hello();
       
    }
    public void hello(){
        System.out.println("hello from simple packagee 2");
    }
   
}