class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
      int indexOf1 = -1; 
        int indexOf2 = -1; 
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                indexOf1 = i;
            } else if (wordsDict[i].equals(word2)) {
                indexOf2 = i;
            }

              if (indexOf1 != -1 && indexOf2 != -1) {
                int calc = Math.abs(indexOf1 - indexOf2);
                if (calc < answer) {
                    answer = calc;
                }
            }
        }
        return answer;
}
}
