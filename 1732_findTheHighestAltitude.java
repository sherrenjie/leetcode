class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highest = 0;
        for(int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if(currentAltitude>highest) {
                highest = currentAltitude;
            }
        }
        return highest;
    }
}
