public class Array1
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		int chu[]= {0,1,4,7,8,5,2,3,6,9,0};
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);

		}
		for(int j=0;j<chu.length;j++)
		{
		System.out.println(chu[j]);
		}
		System.out.println("chu length="+chu.length);
		System.out.println("arr length="+arr.length);
	}

}


