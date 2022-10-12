class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l=0;
    
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        int j=0;
        for(int i=0; i<nums2.length; i++){
            if(hm.containsKey(nums2[i])){
                ans.add(nums2[i]);
                j++;
                if(hm.get(nums2[i])>1){
                    hm.put(nums2[i],hm.get(nums2[i])-1);
                }else{
                    hm.remove(nums2[i]);
                }
            }
        }
        l= ans.size();
        int r[]= new int [l];
        for(int i=0; i<l;i++){
            r[i]=ans.get(i);
        }
        
        return r;
        
    }
}