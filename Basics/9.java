
// pattern
class pattern
{
    int[] remove_a_o(int arr[])
    {
        int l = arr.length;
        int[] arr2 = new int[l];
        //ArrayList<Integer> arr2 = new ArrayList<>();
        int size = arr.length;
        //System.out.println(size);
        int idx = 0;
        for(int i=0;i<size;i++)
        {
            if (is_odd(arr[i])==1)
            {
                /*arr = rearrange(arr,size,i,2);
                size-=2;
                if(i-2 < 0)
                {
                    i = 0 ;
                }
                else
                {
                    i -= 2;
                }*/
                arr2[idx] = arr[i];
                idx+=1;
                i+=2;
            }
        }
        int[] arr3 = new int[10];
        arr3 = fill_array(arr2,idx);
        return arr3;
    }
    int[] fill_array(int[] arr,int position)
    {
        int len = arr.length;
        int limit = position;
        for(int i=0;i<len-limit;i++)
        {
            arr[position] = arr[i];
            position++;
        }
        return arr;
    }
    
    int[] rearrange(int arr[],int size ,int position,int shift)
    {
        
        for(int i = position+1;i<size-shift;i++)
        {
            arr[i] = arr[i+shift];
            size--;
        }
        return arr;
    }
    
    int is_odd(int a)
    {
        if(a%2 !=0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public static void main(String args[])
    {
        int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10,1,2,2,3,4,5,6,7,0,9,8,7 };
        int size = arr.length;
        System.out.print("the array  : ");
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
        
        // arr = {1,2,3,4,5,6,7,8,9,10};
        pattern p = new pattern();
        arr = p.remove_a_o(arr);
        size = arr.length;
        System.out.print("\nthe array after removing elements  : ");
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("\npattern : ");
        int idx = 0;
        for(int i =1;i<=3;i++)
        {
            for(int j =0;j<i*2;j++)
            {
                System.out.print(arr[idx]);
                idx++;
            }
            System.out.println();
            if(i<3)
            {
                for(int k =1;k<=i*3;k++)
                {
                    System.out.println(arr[idx]);
                    idx++;
                }
            }
        }
    }
}