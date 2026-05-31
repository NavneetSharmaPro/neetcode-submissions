class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(String detail: details) {
            int age = (int)(detail.charAt(11) - '0') * 10 + (int)(detail.charAt(12) - '0');
            System.out.println(age);
            System.out.println(detail.charAt(11));
            System.out.println(detail.charAt(12));
            if(age > 60) c++;
        }
        return c;
    }
}