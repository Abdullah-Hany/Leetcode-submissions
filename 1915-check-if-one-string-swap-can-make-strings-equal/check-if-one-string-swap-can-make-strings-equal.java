class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Character firstS1 = null,firstS2=null,secondS1=null,secondS2 = null;

        for (int i=0;i<s1.length();i++){
            char s1Char = s1.charAt(i);
            char s2Char = s2.charAt(i);
            if (s1Char != s2Char){
                if (firstS1 == null){
                    firstS1 = s1Char;
                    firstS2 = s2Char;
                }
                else if (secondS1 == null){
                     secondS1 = s1Char;
                    secondS2 = s2Char;
                }
                else{
                    return false;
                }
            }
        }

        return firstS1 == secondS2 && firstS2 == secondS1;
    }
}