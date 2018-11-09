package leetcode;

public class duplicates_logn {
	

	
//firstposition
public int first(int[] nums) {
	int y=0;int z=0; int end = nums.length;
	
	if(nums.length>=1) {
		
	int le=nums[nums.length-1];
	//finding duplicates
	
	while(nums[z]!=le) {
	
	int t= nums[z];
//	System.out.println("");
//	System.out.println("searching element"+t);
//	System.out.println("Searching in");
//	for(int hg=0;hg<end;hg++) {
//		System.out.print(nums[hg]+" ");
//	}
	
	int[] ans = {-1,-1}; 
	 int l = 0, r = end; 
       
//first element
	 
	 while (l <= r) 
        { 
            int m = l + (r-l)/2; 
  
            // Check if x is present at mid 
            if (nums[m] == t) {
                if(ans[0]==-1) {
                	ans[0]=m;
                }
                else {
                	
                	if(m<ans[0]) {
                		ans[0]=m;
                	}
                }
                
            if(m!=0) {
            	if(nums[m-1]==nums[m]) {
            		r = m - 1;  
            	}
            	else {
            		break;
            	}
            }
                
        }
            // If x greater, ignore left half 
            if (nums[m] < t) {
                l = m + 1; }
            	
  
            // If x is smaller, ignore right half 
            else {
                r = m - 1; }
        
        }   
	 
	 
	 //second element
	 l = 0; r = end - 1;
	 while (l <= r) 
        { 
            int m = l + (r-l)/2; 
  
            // Check if x is present at mid 
            if (nums[m] == t) {
                if(m>ans[1]) {
                	ans[1]=m;
                	//System.out.println("i"+ i);i++;
                }
                
                if(m!=end-1) {
                	if(nums[m+1]==nums[m]) {
                		l = m + 1;
                		//System.out.println("j"+ j);j++;
                		
                	}
                	else {
                		break;
                	}
                }
                
            }
            // If x greater, ignore left half 
            if (nums[m] < t) {
                l = m + 1; //System.out.println("k"+ k);k++;
                }
            	
  
            // If x is smaller, ignore right half 
            if(nums[m]>t) {
                r = m - 1; // System.out.println("m"+ n);n++;
                }
        
        }
	//you get the array
	 
	 
	 if((ans[1]-ans[0])>1) {
		 
		 end=end-(ans[1]-ans[0]-1);
	//	 System.out.println("end "+ end);
	//	 System.out.println("duplicate"+ t);
		 
		
		 
		 //shifting array
		  y=ans[1]+1;
		int x = ans[0]+2;
		 for(int xx = y;xx<nums.length;xx++) {
			// System.out.println("random"+x);
			 int temp1 = nums[x];
			 nums[x]=nums[xx];
			 nums[xx]=temp1;
			 x++;
		 }
		 
		 //updating count
		 z=ans[0]+2; 
		// System.out.println("h");
		 
		 
			// System.out.println("47array");
	//		if(t==45) {	System.out.println("45array");	
	//		 for(int we:nums) {
	//			 
	//					System.out.print(we+" ");
	//				}
	//		}
	 }
	 else if((ans[1]-ans[0])==1){
		 
		 
		 
	//	 System.out.println("w");
		 z=z+2;
		 
	 }
	 else {
	//	 System.out.println("v");
		 z++;
	 }
	 
	 
} //while  loop ends
	//print array
//	System.out.println("finalarray");
//	for(int x:nums) {
//		System.out.print(x+" ");
//	}
	if(z!=nums.length-1  ) {
		if(nums[z+1]==nums[z]) {
		z++;
		}
	}
	}
	else {
		z=-1;
	}
	
	//function ends
	return ++z;
	
}

}
