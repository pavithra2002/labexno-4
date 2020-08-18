package simple2pack.sub2pack;
import simple2pack.*;
public class sub2pack {

   
    public static void main(String[] args) {
        
        System.out.println("in simple package 2 subpack");
        System.out.println("accessing simple package 2");
        package2 obj=new package2();
        obj.hello();
       
    }
    public void hello(){
        System.out.println("hello from simple subpackage 2");
    }
   
}
