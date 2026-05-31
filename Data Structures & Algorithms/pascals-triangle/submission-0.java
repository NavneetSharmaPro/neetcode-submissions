class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int val = 1;
            for(int j = 1; j <= i; j++) {
                val = val * (i - j + 1)/j;
                row.add(val);
            }
            res.add(row);
        }
        return res;
    }
}