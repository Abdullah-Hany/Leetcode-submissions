class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        for (int i=0;i<command.length();i++){
            if (command.charAt(i)=='G'){
                s.append("G");
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                s.append("o");
                i++;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)!=')'){
                s.append("al");
                i+=3;
            }
        }
        return s.toString();
    }
}