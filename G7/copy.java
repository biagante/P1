import java.util.Scanner; 
 
public class HelloWorld { 

 public static void main (String[] args) { 
 
 Scanner sc = new Scanner(System.in); 
 
 String nome; 
 System.out.println("Insert name of whom you want to welcome: "); 
 nome = sc.nextLine(); 
 
 System.out.println("Hello World and " + nome); 
 sc.close(); 
} 
}
 
