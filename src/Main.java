import java.util.*;
public class Main {

    public static boolean checkAge(int age) throws UnderYourAgeException{

            if(age<18){
                // System.out.println(UnderAgeException.underAgeException());
                throw new UnderYourAgeException("You're still under age");
            }



        return true;
    }


    public static void main(String[] args) {
        int age;
        Scanner s=new Scanner(System.in);
        age=s.nextInt();


        try{
            if(checkAge(age)){
                System.out.println("Congrats! You have passed");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

    }

}
