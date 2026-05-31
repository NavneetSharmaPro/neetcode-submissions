class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for(String email: emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            local = local.split("\\+")[0];
            // local = local.replaceAll("\\.", "");// dont use replaceall because . means replaec all characters in regex
            local = local.replace(".", ""); 
            String resolvedEmail = local + domain;
            unique.add(resolvedEmail);
        }
        return unique.size();
    }
}