class Solution {
    public String firstPalindrome(String[] words) {
      for(String word : words){
        String reverse = "";

        for(int i = word.length() - 1 ; i >= 0 ; i--){
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            return word;
        }
      }
      return "";
    }
}