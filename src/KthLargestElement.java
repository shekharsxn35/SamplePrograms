import java.util.PriorityQueue;

/**
 * Created by shekhar on 15/04/17.
 */
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);

            if(queue.size()>k) {
                queue.poll();
            }
        }

        System.out.println(queue.peek());



    }
}
