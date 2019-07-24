/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author Hrido
 */
public class Array2 {
static int[] ar(int a[]){
//do yor job;
    return new int[]{4,5};  
}

    public static void main(String[] args) {
      int[][] a={
          {1,2,3,5},
          {36,34534,45,4}
      };
      
      for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
          System.out.println(a[i][j]);
      }
      }
      
      for(int i[]: a){
      for(int j: i){
          System.out.println(j);
      }
      }
      
      int[][][][] three=new int[3][4][5][7];
      for(int i[][][]:three){
          for(int j[][] : i){
          for(int k[]: j){
              for(int l: k)
              System.out.println(l);
          }
          }
      
      }
      
      int[][] jag=new int[3][];
      jag[0] =new int[4];
      jag[1] =new int[2];
      jag[2] =new int[5];
      jag[3] =new int[7];
      
     int[] s;
     s=ar(new int[]{3,4});
     
    }
    
}
