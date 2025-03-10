class Solution {
    static String vowels = "aeiou";

    public long countOfSubstrings(String word, int k) {
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        long cnt = 0;
        int consts = 0;
        int st = 0;
        int[] vowelSeen = new int[5];
        int tempI = st;
        int increment = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (isVowel(ch)) {
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
            } else {
                consts++;
            }

            while (consts > k) {
                char chRemoved = word.charAt(st++);

                if (isVowel(chRemoved)) {
                    int left = vowelCount.get(chRemoved) - 1;

                    if (left == 0) {
                        vowelCount.remove(chRemoved);
                    } else {
                        vowelCount.put(chRemoved, left);
                    }
                } else {
                    consts--;
                }

               
                vowelSeen = new int[5];
                tempI = st;
                increment = 0;
                
            }

            if (consts == k && vowelCount.size() == 5) {
                while (true) {
                    char chTemp = word.charAt(tempI);
                    int chIndex = vowels.indexOf(chTemp);

                    if (chIndex == - 1) {
                        cnt++;
                        break;
                    }

                    increment++;
                    vowelSeen[chIndex]++;

                    if (vowelCount.get(chTemp) == vowelSeen[chIndex]) {
                        increment--;
                        vowelSeen[chIndex]--;
                        cnt++;
                        break;
                    }

                    tempI++;
                }

                cnt += increment;
            }
        }

        return cnt;
    }

    private boolean isVowel(Character ch) {
        return vowels.indexOf(ch) > -1;
    }
}