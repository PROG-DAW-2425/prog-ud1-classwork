
package classwork.java;


public class Activitat14 {
    
    public static void main(String[] args) {  
        boolean A = false;
        boolean B = false;
        
        System.out.println("A\tB\tA&&B");
        System.out.println("--------------------");
        System.out.print(A + "\t" + B + "\t" + (A && B) + "\n");
        
        A = true; B = false;
        System.out.print(A + "\t" + B + "\t" + (A && B) + "\n");
        
        A = false; B = true;
        System.out.print(A + "\t" + B + "\t" + (A && B) + "\n");
        
        A = true; B = true;
        System.out.print(A + "\t" + B + "\t" + (A && B) + "\n");
     
    
    }
    
    
    
}
