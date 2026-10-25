import java.util.Scanner;
public class Main2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Grade");
        int Grade = input.nextInt();
        System.out.print(" Your grade is ");

        System.out.println(Grade >= 80 ? " A" :
                           Grade >= 70 ? "B" :
                           Grade >= 50 ? "C" :
                           Grade >= 30 ? "D " : "F"
                           );
         
           input.close();
       


    }
    

}

    

