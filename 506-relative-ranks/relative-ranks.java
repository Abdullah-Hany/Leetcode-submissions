class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Medal> map = new HashMap<Integer,Medal>();

        for(int i=0;i<score.length;i++){
            map.put(score[i],new Medal(i));
        }

        Arrays.sort(score);
        int counter = 3;
        for (int i = score.length-1 ; i>=0;i--){
            if (i == score.length-1){
                addScore(map,score[i],"Gold Medal");
            }
            else if (i == score.length-2){
                addScore(map,score[i],"Silver Medal");
            }
            else if (i == score.length-3){
                addScore(map,score[i],"Bronze Medal");
            }
            else{
                addScore(map, score[i],++counter + "");
            }
        }

        String[] answer = new String[score.length];

        for (Medal medal : map.values()) {
            answer[medal.index]=medal.place;
        }

        return answer;
    }
    
    private void addScore(Map<Integer,Medal> map,Integer score,String place){
        Medal medal = map.get(score);
        medal.place = place;
    }


    class Medal{
        String place;
        int index;

        Medal(int index){
            this.index = index;
        }

        public String toString(){
            return "score : " + place + " index : "+index;
        }
    }
}