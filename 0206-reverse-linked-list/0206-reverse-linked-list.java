/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;   // curr는 새 노드가 아니라, 매개변수로 받은 head가 가리키는 그 노드를 그대로 가리킴
        ListNode prev = null;   // prev는 아직 아무것도 안 가리키는 상태 → 참조 타입에서 "아무것도 없음"은 null
        ListNode temp = null;   // temp도 마찬가지로, 루프 안에서 매번 새 값을 받을 거라 시작값은 null이면 충분

        while(curr != null){
            temp = curr.next;   // 1. curr가 원래 어디로 가려 했는지 미리 저장 (안 그러면 잃어버림)
            curr.next = prev;   // 2. ★ 여기가 "뒤집기"예요 — curr의 화살표를 prev 쪽으로 돌려놓음
            prev = curr;        // 3. prev를 한 칸 전진
            curr = temp;        // 4. curr를 한 칸 전진
        }

        return prev;
    }
}