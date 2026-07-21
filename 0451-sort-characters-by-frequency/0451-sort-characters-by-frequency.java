class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int[] freq = new int[256];
        int[] first = new int[256];

        Arrays.fill(first, -1);

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            freq[x]++;

            if (first[x] == -1) {
                first[x] = i;
            }
        }

        Character[] ch = new Character[n];

        for (int i = 0; i < n; i++) {
            ch[i] = s.charAt(i);
        }

        Arrays.sort(ch, (a, b) -> {
            if (freq[a] != freq[b]) {
                return freq[b] - freq[a];
            }
            return first[a] - first[b];
        });

        for (char x : ch) {
            ans.append(x);
        }

        return ans.toString();
    }
}