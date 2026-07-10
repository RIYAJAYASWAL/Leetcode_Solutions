class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int count=0;
        char[] arr=magazine.toCharArray();
        for(char c:ransomNote.toCharArray()){
           for (int i = 0; i < arr.length; i++) {
                if (c == arr[i]) {
                    count++;
                    arr[i] = '#';    
                    break;
                }
            }
        }
        return count==n;
    }
}