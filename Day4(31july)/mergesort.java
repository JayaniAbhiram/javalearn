
import java.util.Arrays;

public class mergesort {


    public static void mergemethod(int[] nums,int left,int mid,int right){

        int n1 = (mid - left)+1;
        int n2 = right-mid;

        int[] leftnums = new int[n1];
        int[] rightnums = new int[n2];

        for(int i=0;i<n1;i++){
            leftnums[i] = nums[left+i];
        }
        for(int j=0;j<n2;j++){
            rightnums[j] = nums[mid+1+j];
        }

        int i=0,j=0;
        int k=left;

        while(i<n1 && j<n2){
            if(leftnums[i]<=rightnums[j]){
                nums[k] = leftnums[i];
                i++;
               
            }
            else{
                nums[k] = rightnums[j];
                j++;
            }
            k++;
            
        }

        while(i<n1){
            nums[k] = leftnums[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k] = rightnums[j];
            j++;
            k++;
        }



    }


    public static void mergesortalgorithm(int[] nums,int left,int right){

        if(left<right){
            int mid = (left+right)/2;

            mergesortalgorithm(nums,left,mid);
            mergesortalgorithm(nums,mid+1,right);

            mergemethod(nums,left,mid,right);
        }

    }
    public static void main(String[] args) {

        int[] nums = new int[]{3,2,5,2,4,5,6,3,2,12,4,56,6,3,2,1};

        System.out.println(Arrays.toString(nums));

        mergesortalgorithm(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
        
    }
    
}
