package simple.subpackage1;
import simple.simplepack;
public class sub1pack {

    public static void main(String[] args) {
        System.out.println("in subpackage of simplepackage 1");
        simplepack obj=new simplepack();
        System.out.println("Accessing package");
        obj.display();
       
       
    }
    public void show(){
       System.out.println("welcome from subpackage of simplepackage 1");
    }
   
}