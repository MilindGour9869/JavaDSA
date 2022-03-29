package reverse_the_array;
import java.util.*;


public class  Array{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();


        int[] n= new int[m];



        for(int i=0;i<m;i++)
        {

            n[i]= sc.nextInt();

        }

        for(int i=--m;i>=0;i--)
        {

           System.out.println(n[i]);


        }




     
    }


}