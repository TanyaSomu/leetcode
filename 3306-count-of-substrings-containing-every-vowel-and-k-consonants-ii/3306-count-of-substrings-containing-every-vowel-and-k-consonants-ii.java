class Solution {
     public long countOfSubstrings(String word, int k) {
        return atMost(word, k) - atMost(word, k - 1);
    }

    private long atMost(String word, int k) {

        if (k < 0)
            return 0;

        int[] last = new int[5];

        Arrays.fill(last, -1);

        int left = 0;
        int consonants = 0;
        long ans = 0;

        for (int right = 0; right < word.length(); right++) {

            char c = word.charAt(right);

            switch (c) {
                case 'a':
                    last[0] = right;
                    break;
                case 'e':
                    last[1] = right;
                    break;
                case 'i':
                    last[2] = right;
                    break;
                case 'o':
                    last[3] = right;
                    break;
                case 'u':
                    last[4] = right;
                    break;
                default:
                    consonants++;
            }

            while (consonants > k) {
                if (!isVowel(word.charAt(left)))
                    consonants--;
                left++;
            }

            int minLast = Integer.MAX_VALUE;

            for (int x : last)
                minLast = Math.min(minLast, x);

            if (minLast >= left)
                ans += minLast - left + 1;
        }

        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}