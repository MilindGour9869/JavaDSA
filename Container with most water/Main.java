public class Main {
    public static void main (String args[])
    {
        int height[]= {1,1} ;

        int g[]=new int[height.length];
        g=height;


        long m =-1L;

        for(int i=0;i<height.length-1;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                long n;
                if(height[i]<height[j])
                n=height[i];
                else
                n=height[j];

                if(m<n*(j-i))
                {
                    m=n*(j-i);
                }

            }


        }

        System.out.println(m);







    }
    
}
