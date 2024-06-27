class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] firstWord = word1.toCharArray();
        char[] secondWord = word2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int word1Length = firstWord.length;
        int word2Length = secondWord.length;
        int min = Math.min(word1Length, word2Length);

        for(int i = 0; i < min; i++) {
            sb.append(firstWord[i]);
            sb.append(secondWord[i]);
        }
        if(word1Length> word2Length) {
            for(int i = min; i < word1Length; i++) {
                sb.append(firstWord[i]);
            }
        }
        if(word2Length> word1Length) {
            for(int i = min; i < word2Length; i++){
                sb.append(secondWord[i]);
            }
        }

        return sb.toString();




    }
}
