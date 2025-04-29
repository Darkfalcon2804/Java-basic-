import java.util.*;;
public class greatest {
public static void main(String[] args){
       Scanner i=new Scanner(System.in);
       int a,b,c;
       System.out.print("Enter the value of A: ");
       a=i.nextInt();
    System.out.print("Enter the value of B: ");
    b=i.nextInt();
    System.out.print("Enter the value of C: ");
    c=i.nextInt();
if(a>b){
    if(a>c){
        System.out.print(a+" is the greatest");
    }
    else          System.out.print(c+" is the greatest");
}
else {
    if(b>c)          System.out.print(b+" is the greatest");
    else         System.out.print(c+" is the greatest");

}
}
}
