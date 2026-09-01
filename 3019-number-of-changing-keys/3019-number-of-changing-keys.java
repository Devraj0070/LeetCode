class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++){
            char perv = Character.toLowerCase(s.charAt(i - 1));
            char curr = Character.toLowerCase(s.charAt(i));

            if (perv != curr){
                count++;
            }
        }

        return count;
    }
}