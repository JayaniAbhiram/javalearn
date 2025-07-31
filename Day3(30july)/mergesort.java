
import java.util.Arrays;

public class mergesort {
    private static void mergesortalgo(int[]nums, int l, int r) {

        if(l<r){
            int mid = (l+r)/2;

            mergesortalgo(nums, l, mid);
            mergesortalgo(nums, mid+1, r);

            merge(nums,l,mid,r);
        }
        
    }


    private static void merge(int[] nums, int l, int mid, int r) {

        int n1 = mid-l+1;
        int n2 = r-mid;

        int []lnum = new int[n1];
        int []rnum = new int[n2];

        for(int i=0;i<n1;i++){
            lnum[i] = nums[l+i];
            
        }
        for(int j=0;j<n2;j++){
            rnum[j] = nums[mid+1+j];
        }


        int i=0, j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(lnum[i]<rnum[j]){
                nums[k] = lnum[i];
                i++;
            }
            else{
                nums[k] = rnum[j];
                j++;
            }
            k++;
        }



           
        while (i < n1) {
            nums[k] = lnum[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[], if any
        while (j < n2) {
            nums[k] = rnum[j];
            j++;
            k++;
        }



       
    }


    public static void main(String[] args) {

        int[] nums = {4,5,2,7,32,6,7,3,2};

        

        System.out.println(Arrays.toString(nums));
        mergesortalgo(nums,0,nums.length-1);


        System.out.println(Arrays.toString(nums));



        
    }

    
}
