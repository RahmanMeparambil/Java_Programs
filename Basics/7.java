// pattern
class pattern
{
    public static void main(String args[])
    {
        int i,j,p;
        int n = 4 ;
        p = 1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(p); 
                p++;
            }
            System.out.print("\n");
        }

    }
}