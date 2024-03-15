import java.util.*;
public class perfectNumber{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number");
        int sum=0;
        int num=obj.nextInt();
        for(int i=0;i<=num/2;i++){
            if(num%2==0){
                sum=sum+i;
            }
            if(sum==num){
                System.out.println("Perfect Number");
            }
        }
    }
}
