class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int lo=-1,hi=0,white=0; hi < blocks.length(); ++hi){
            white += blocks.charAt(hi)=='W' ? 1:0;
            if(hi-lo>=k){
                min=Math.min(min,white);
                white -= blocks.charAt(++lo)=='W' ? 1:0;
            }
        }
        return min;
    }
}