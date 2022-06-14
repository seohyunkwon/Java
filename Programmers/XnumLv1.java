public class XnumLv1 {
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long t = x;
        for(int i=0; i<n; i++) {
            answer[i] = t;
        	t = t + x;
        }
        
        return answer;
    }
}