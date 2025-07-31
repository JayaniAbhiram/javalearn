
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergesortedarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3; 
        int[] nums2 = {2,5,6}; 
        int n = 3;

        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
            
                
            
        }

        for(int i=0;i<nums1.length-1;i++){
            for(int j=i+1;j<nums1.length;j++){
                if (nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                    
                }

            }
        }
        System.out.println(Arrays.toString(nums1));


        List<Integer> newlist = new ArrayList<>();

        // for(int i=0;i<nums1.length;i++){
        //     if(nums1[i]!=0){
        //         newlist.add(nums1[i]);

        //     }
            
        // }
        for(int i=0;i<nums2.length;i++){
            newlist.add(nums2[i]);
        }

        

        
        System.out.println(newlist);

        for(int i=0;i<newlist.size()-1;i++){
            for(int j=i+1;j<newlist.size();j++){
                if (newlist.get(i) > newlist.get(j)){
                    int temp = newlist.get(i);
                    newlist.set(i, newlist.get(j));
                    newlist.set(j, temp);

                }

            }
        }
        System.out.println(newlist);
    }
    
}
