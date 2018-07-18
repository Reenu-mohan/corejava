
public class array1 {

	public static void main(String[] args) {
		int arr1[]= {23,45,67,26,12};
		for(int i=0;i<(arr1.length);i++)
		{
			System.out.println(arr1[i]);
		}
			System.out.println("reverse");
		for(int i=arr1.length-1;i>=0;i--)

		{
			System.out.println(arr1[i]);
		}
		
	for(int i=0;i<(arr1.length);i++)
		{
			if(arr1[i]==26)
		System.out.println(arr1[i]+" is found");
			break;//to stop checking when we first found  the 26.
			
		}
	int arr[]= {12,50,2,5,55,25} ;
	int lar = 0 ,sm=arr[0];
	for(int i=0;i<(arr.length);i++)
	{
		if(arr[i]>lar)
		{
			 lar=arr[i];
			
		}
		
	}
	System.out.println("largest is"+lar);
	int sum=0;
	
	for(int i=0;i<(arr.length);i++)
	
	{
		
		if(arr[i]<sm)
		{
			 sm=arr[i];
			
		}
		
	}
	System.out.println("smallest is"+sm);
	for(int i=0;i<(arr.length);i++)
	{
		if(arr[i]%2==0)
		{
			sum=sum+arr[i];
			
		}
		
	}System.out.println("sum of even nbr"+sum);
	}

}

