import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;    
        
        Queue<Integer> pQue = new PriorityQueue<Integer>();
        
        for(int num : scoville) {
            pQue.offer(num);
        }
        
        while(pQue.peek() < K) {
            if(pQue.size() == 1) {
                return -1;
            }
            pQue.offer(pQue.poll() + (pQue.poll()*2));
            answer++;
        }
 
        return answer;
    }
}