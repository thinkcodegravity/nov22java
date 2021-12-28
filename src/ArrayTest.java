
public class ArrayTest {

	public static void main(String[] args) {
		 
		FacebookCustomer fc1=new FacebookCustomer();
		FacebookCustomer fc2=new FacebookCustomer();
		FacebookCustomer fc3=new FacebookCustomer();
		FacebookCustomer fc4=new FacebookCustomer();
		FacebookCustomer fc5=new FacebookCustomer();
		
		FacebookCustomer[] custArray=new FacebookCustomer[1000];
		//custArray[0]=new FacebookCustomer();
		for(int i=0 ; i<1000 ;i++ )
			custArray[i]=new FacebookCustomer();
		
		int[] scores=new int[5];
		scores[0]=1234;
		scores[1]=34534;
		scores[2]=3453;
		scores[3]=12;
		scores[4]=11;
		
		System.out.println(    scores[4]   );
		
		System.out.println();
		
		int[] ratings= { 12,34,11,12};
		System.out.println(   ratings[3]   );
		
		FacebookCustomer[][] custArrayMD=new FacebookCustomer[5][2];
		for(int i=0 ; i<5 ;i++ )
			for(int j=0 ; j<2 ;j++ )
				custArrayMD[i][j]=new FacebookCustomer();
		
		
		
		int[] arr1=new int[5];
		int[] arr2=new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[6]=50;
		
		System.arraycopy(arr1, 1,arr2, 2, 3);
		// for-each.... enhanced for loop
		System.out.println(arr1.length);
		for(int i:arr1)
			System.out.println(i);
		
		for(int cursor=0 ; cursor<arr1.length ;cursor++ )
			System.out.println(arr1[cursor]);
		
		for(int i:arr2)
			System.out.println(i);
	}

}
