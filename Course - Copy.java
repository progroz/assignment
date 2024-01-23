import java.util.*;
public class Course {
    public static void main(String[] args) {
        int a=1;
        int py=1;
        int j=1;
        int ph=1;
        while (a==1) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your Course");
        String Course=sc.nextLine();
        System.out.println("Enter your name");
       
        

        
        if (Course.equals("java")) {
            System.out.println("course id is java"+j);
            j++;
        } 
        else if (Course.equals("py")){
            System.out.println("course id is Python"+py);
            py++;

        }
        else if (Course.equals("php")){
            System.out.println(" course id is php"+ph);
            ph++;
        }
        
        System.out.println(Course);
        System.out.println(name);
        System.out.println("Want to continue press 1");

        a=sc.nextInt();
        }
        




    }
}