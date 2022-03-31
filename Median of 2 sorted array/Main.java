import java.util.*;

public class Main{

    public static void main(String args[]){

        int[] nums1  ={1 ,3};
        int nums2[] = {3};

       
        int k = nums2.length;
        int w =0;

        int j=0;

        int q[] = new int[k+nums1.length];

        int i=0;
         


        while(i<q.length)
        { 
           

            if(nums1[j] < nums2[i])
            { 
                q[w] = nums1[j];
                j++;
                
                

                System.out.println(q[w]);
                w++;
                
            }
            else
            {

                q[w]=nums2[i];
                
                i++;
                System.out.println(q[w]);
                w++;
            }

            if(i>=nums2.length || j>=nums1.length)
            break;

        }

        if(i<nums2.length)
        {
            while(i<nums2.length)
            {
                q[w]=nums2[i];
                i++;
                System.out.println(q[w]);
                w++;
               
            }

        }

        if(j<nums1.length)
        { 
            while(j<nums1.length)
            {
                q[w]=nums1[j];
                j++;
                System.out.println(q[w]);
                w++;
               
            }
        }


        float a;

        if(q.length%2 == 0)
        {
            System.out.println(q[q.length/2-1]);
            a=q[q.length/2-1] + q[q.length/2 ];
            
            a=a/2;


        }
        else{
            a = q[q.length/2 - 1];
            System.out.println(q[q.length/2]);
            
        }



        System.out.println((float)a);


        



    }


}