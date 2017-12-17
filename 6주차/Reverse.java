import java.util.Scanner;

public class Reverse {
          void reverse(){ 
              Scanner s=new Scanner(System.in);
              System.out.print("문자열을 입력하시오: ");
              String input=s.nextLine();
              
              int len = input.length();
              char[] change=new char[len]; 
                        
              for(int i=0; i<len; i++){
              change[i]=input.charAt(i);
              }
                        
              for(int i=len-1; i>=0; i--)
              {
              System.out.print(change[i]);
              }
                   
          }
     
     public static void main(String[] args) {
          Reverse rev = new Reverse();
          rev.reverse(); 
          
     }
}

