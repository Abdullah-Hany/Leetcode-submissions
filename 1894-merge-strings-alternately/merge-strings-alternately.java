class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size = Math.min(word1.length(),word2.length());
        int counter =0;
        StringBuilder s = new StringBuilder();
        for (;counter<size;counter++){
            s.append(word1.charAt(counter));
            s.append(word2.charAt(counter));
        }
        if (word1.length() > counter){
            while(counter<word1.length()){
                s.append(word1.charAt(counter));
                counter++;
            }
        }
        if (word2.length() > counter){
            while(counter<word2.length()){
                s.append(word2.charAt(counter));
                counter++;
            }
        }
        return s.toString();
    }
}