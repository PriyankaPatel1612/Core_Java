//Array as an argument
public class Test13 {
    public static void main(String[] args) 
    {
        // int arr[] = new int[3];
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {10,20,30,40,50};
        int arr3[] = arr1;       //reference can hold the another object or its hashcode
        Test13 obj = new Test13();
        obj.add(arr1);
        obj.add(arr2);
        obj.add(arr3);
        System.out.println(arr1);

    }

    void add(int arr[])
    {
        int sum=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }   
}
