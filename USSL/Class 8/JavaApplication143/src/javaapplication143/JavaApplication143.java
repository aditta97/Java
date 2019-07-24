package javaapplication143;


public class JavaApplication143 {


    public static void main(String[] args) {
       String name="helloo";
       String roo="hhh";
       String foo=null;
        try {
           //System.out.println(roo.charAt(0));  //Null-Pointer Exception
           //System.out.println(name.charAt(5));   //String index outof bound
           try{ 
           System.out.println(foo.charAt(0));}
           catch(NullPointerException e){
               try{
               System.out.println(name.charAt(7));
               }
               catch(StringIndexOutOfBoundsException b){
                   System.out.println("Indise catch another exception");
                   
               }
           }
        } 
        catch(NullPointerException e){
            System.out.println("ROO is null");
        }
        
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            
        }
    }
    
}
