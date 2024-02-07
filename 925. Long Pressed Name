class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0; //for name
        int j = 0; // for typed

        if(typed.length() < name.length()){
            return false;
        }

        while(i < name.length() && j < typed.length()) {
            if(name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if(i - 1 >= 0 && typed.charAt(j) == name.charAt(i-1)) {
                j++;
            } else{
                return false;
            }

        }

        while(j < typed.length()) {
            if(typed.charAt(j) != name.charAt(i-1)) {
                return false;
            }
            j++;
        }

        //if it reached the end of the typed, but there's still element left in name, meants that it won't be long pressed cuz the character in name does not exist in typed
        if(i< name.length()) {
            return false;
        }
        return true;
    }
}
