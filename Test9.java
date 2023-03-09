//sorting of an array
public class Test9
{
    public static void main(String[] args) {
        int arr[] = {50,40,20,10,30};
        int temp;
        
        System.out.print("Before sorting: ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int i=0 ; i<arr.length-1 ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i]>arr[j])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }

        System.out.print("\nAfter sorting: ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
