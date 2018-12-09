
package csediu;

class Box
{
    int height, width, depth;
    
}

public class Boxdemo {


    public static void main(String[] args) {
        
        Box mybox =new Box();
            mybox.height=2;
            mybox.width=3;
            mybox.depth=2;
            
        int volume = mybox.height*mybox.width*mybox.depth;    
        System.out.println(volume); 
    }
    
}
