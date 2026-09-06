class Solution {
    public int checkScore(StringBuilder s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
    public int countRotations(String s, int k) {
        int n = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        int rotations = 0;
        while (rotations < n) {
            if (checkScore(sb) == k) {
                count++;
            }
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            rotations++;
        }
        return count;
    }
}