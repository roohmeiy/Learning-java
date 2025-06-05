package linkedList; /* List1 =[2,4,3]
 list2=[5,6,4]
 list3= 342+465=> 807 => 708
  */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public class SumofLinkedList{
      public static void main(String[] args) {
          ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));

          ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
          ListNode i3= addTwoNumbers(l1,l2);

          ListNode currentt=i3;
          while(currentt !=null){
              System.out.println(currentt.val);
              currentt=currentt.next;
          }
      }

      public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode newHead = new ListNode(0);  // starting node
          ListNode current = newHead;
          int carry = 0;

          while (l1 != null || l2 != null) {
              int val1 = (l1 != null) ? l1.val : 0;
              int val2 = (l2 != null) ? l2.val : 0;

              int sum = val1 + val2 + carry;
              carry = sum / 10;
              current.next = new ListNode(sum % 10); // new digit
              current = current.next;

              if (l1 != null) l1 = l1.next;
              if (l2 != null) l2 = l2.next;
          }

          // handle leftover carry
          if (carry > 0) {
              current.next = new ListNode(carry);
          }

          return newHead.next;
      }
      }