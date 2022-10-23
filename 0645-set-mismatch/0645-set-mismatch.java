public class Solution {
    public int[] findErrorNums(int[] nums) {
        Map <Integer,Integer> map = new HashMap();
        int dup=-1,miss=1;
        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for(int i=1; i<= nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    dup=i;
                }
            }else{
                miss=i;
            }
        }
        return new int[]{dup,miss};
    }
}
