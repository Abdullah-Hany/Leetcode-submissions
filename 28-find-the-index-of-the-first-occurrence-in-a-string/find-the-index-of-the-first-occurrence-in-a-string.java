class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length()<needle.length()){
            return -1;
        }

        char n = needle.charAt(0);
        for (int i=0;i<haystack.length();i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                int counter=0;
                int hayCounter=i;
                while(counter<needle.length()&&hayCounter<haystack.length()){
                    if (haystack.charAt(hayCounter) !=needle.charAt(counter)){
                        break;
                    }
                    counter++;
                    hayCounter++;
                }
                if (counter == needle.length()){
                    return i;
                }
            }
        }
        return -1;

    }
}