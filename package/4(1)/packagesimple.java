package simple;
import simple.subpackage1.*;
public class simplepack {

    public static void main(String[] args) {
       System.out.println("in simple package 1");
       System.out.println("accessing  subpackage 1");
       sub1pack obj=new sub1pack();
       obj.show();
    }
    public void display(){
       System.out.println("welcome from simple java package 1");
    }
   
}