package SDET2;

import java.util.Arrays;

public class SortnumArraysInt_String {

	
	
	
	/*
	public static void main(String[] args) {
		
		int[] a= {65,4,6,53,2,1,58,97,89,7,897,86};
		
		
		

		
		Arrays.sort(a);//for ascening orderr for descind just reverse the sort u wil get it by using reverse methid
		               //in collection.sort() and collection.reverse()
		
		
		for (int i : a)
		{
			System.out.print(i+",");
		}
		
		
		
	}
	
	*/
	public static void main(String[] args) {

        String[] a={"Banana","copy","Apple","Banana",};

        Arrays.sort(a);;//for ascening orderr sort(),
                        // to descedning it
                    //it we have one logic if we ascend elments smal to big if we reverse that it becomes descenign right??? thats the logic
                     //so to reverse we have methoid Arrays.reverse(); or collectons.sort() and collectons.reverse();



        for (int i=0;i<a.length;i++)
        {

            System.out.println(a[i]);



        }

	
	
	
	
	}
}
