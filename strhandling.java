import java.util.Scanner;


public class stringhandling {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     
      func n = new func();
        
         String[] str ={"java virtual machine","local area network","integrated Development Environment","java Development Kit"};
         
       
    for(int i=0;i<str.length;i++)
    {
      
          System.out.println(str[i]);
          String s = str[i];
          String[] arr = s.split(" ");
          for (String a : arr)
               System.out.println(a);
          n.acro(arr);
      }
     
    }
    
   
}

class func{
    public void acro(String a[]){
        String m="";
        for(int j =0;j<a.length;j++){
            m=m + String.valueOf(a[j].charAt(0)).toUpperCase();
           }
        System.out.println(m);
    }
}
