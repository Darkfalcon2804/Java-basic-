import java.util.*;
public class leapyear {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int y;
        System.out.print("Enter the year: ");
        y=x.nextInt();
        if((y%400==0) || (y%4==0&&y%100!=0)){
            System.out.print("The given year "+y+" is a leap year");
        }
        else System.out.print(y+" is not a leap year");
    }
}
