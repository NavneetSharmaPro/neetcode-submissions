class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] mp = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) mp[nums[i]]++;
        // for(int i = 0; i < mp.length; i++) System.out.println(mp[i]);
        for(int i = 1; i < mp.length; i++) if(mp[i] == 0) res.add(i);
        return res;
    }
}