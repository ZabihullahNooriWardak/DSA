package JumpGame2InJava;
class Solution {
    public int jump(int[] nums) {
     int counter=0;
     int changeable;
     int BigItem = nums[0];
     for(changeable =0; changeable<BigItem;){
          if(BigItem >= nums.length-1 && BigItem == nums[0]){
            return 1;
          }
     if(nums[changeable] > BigItem){
        BigItem = nums[changeable];
        changeable++;
     }




          

     }






        return 0;
    }
public static void main(String []args){

}
}