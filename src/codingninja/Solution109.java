package codingninja;

// 109. Count And Say
// https://www.codingninjas.com/studio/problems/count-and-say_8230807?challengeSlug=striver-sde-challenge
public class Solution109 {
    public static String writeAsYouSpeak(int n) {
        if (n == 1)
            return "1";
        String res = writeAsYouSpeak(n - 1);
        return process(res);
    }

    public static String process(String res) {
        StringBuilder ans = new StringBuilder();
        char curr = res.charAt(0);
        int count = 0;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == curr) {
                count++;
            } else {
                ans.append(count).append(curr);
                curr = res.charAt(i);
                count = 1;
            }
        }
        return ans.append(count).append(curr).toString();
    }
}