public class maxrepeatelement {
    public static void main(String[] args) {
        int[] nums = {4,3,5,4,4,3,4,4};

        

        for(int i=0;i<nums.length;i++){
            int freq = 0;
            for(int j=0;j<nums.length;j++){
                if (nums[i] == nums[j]){
                    freq = freq+1;

                }

            }
            System.out.println(freq);
            if (freq > nums.length/2){
                System.out.println(nums[i]);
                return;
            }
            

        }
        
        
    }
    
}
