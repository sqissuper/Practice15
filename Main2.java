import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    //左旋转字符串
//    public static String LeftRotateString(String str,int n) {
//        if(str.length() < n) return "";
//        char[] ch = str.toCharArray();
//        while(n != 0) {
//            char c = ch[0];
//            int i = 0;
//            for(; i < ch.length - 1; i++) {
//                ch[i] = ch[i + 1];
//            }
//            ch[i] = c;
//            n--;
//        }
//        String s1 = new String(ch);
//        return s1;
//    }

    //反转单词顺序列
//    public static String ReverseSentence(String str) {
//        if(str.trim().equals("")) return str;
//        StringBuilder sb = new StringBuilder();
//        String[] s = str.split(" ");
//        for(int i = s.length - 1; i >= 0; i--) {
//            sb.append(s[i]).append(" ");
//        }
//        return sb.toString().trim();
//    }

      //数组中重复的数字
//    public int duplicate (int[] numbers) {
//        // write code here
//        for(int i = 0; i < numbers.length - 1; i++) {
//            for(int j =i + 1; j < numbers.length; j++) {
//                if(numbers[i] == numbers[j]) {
//                    return numbers[i];
//                }
//            }
//        }
//        return -1;
//    }

    //扑克牌顺子
//    public boolean IsContinuous(int [] numbers) {
//        Arrays.sort(numbers);
//        int count = 0;
//        int n = numbers.length;
//        if(n != 5) return false;
//        for(int i = 0; i < n; i++) {
//            if(numbers[i] == 0) {
//                count++;
//            }
//        }
//        if(count > 4) return false;
//        for(int i = count + 1; i < 5; i++) {
//            if(numbers[i] == numbers[i - 1]) {
//                return false;
//            }
//        }
//        int tmp = numbers[4] - numbers[count];
//        if(tmp > 4) return false;
//        return true;
//    }

    //孩子们的游戏
//    public static int LastRemaining_Solution(int n, int m) {
//        if(m == 0 || n == 0) return -1;
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < n; i++) {
//            list.add(i);
//        }
//        int index = 0;
//        while(list.size() > 1) {
//            index = (m - 1 + index) % list.size();
//            list.remove(index);
//        }
//        return list.get(0);
//    }

//    public static void swap(int[] arr) {
//        int tmp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = tmp;
//    }

    //字符流中第一个不重复的字符
//    HashMap<Character,Integer> map = new HashMap<>();
//    List<Character> list = new ArrayList<>();
//    public void Insert(char ch)
//    {
//        if(map.containsKey(ch)) {
//            int ret = map.get(ch);
//            map.put(ch,ret + 1);
//        } else {
//            map.put(ch,1);
//        }
//        list.add(ch);
//    }
//    public char FirstAppearingOnce()
//    {
//        for(char ret : list) {
//            if(map.get(ret) == 1) {
//                return ret;
//            }
//        }
//        return '#';
//    }


    //链表中环的入口节点
//    public ListNode EntryNodeOfLoop(ListNode pHead) {
//        if(pHead == null) return null;
//        ListNode fast = pHead;
//        ListNode slow = pHead;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow) {
//                break;
//            }
//        }
//        if(fast == null || fast.next == null) return null;
//        slow = pHead;
//        while(fast != slow) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return fast;
//    }


    //删除链表中重复的节点
//    public ListNode deleteDuplication(ListNode pHead) {
//        if(pHead == null) return null;
//        ListNode newHead = new ListNode(-1);
//        ListNode tmp = newHead;
//        ListNode cur = pHead;
//        while(cur != null) {
//            if(cur.next != null && cur.next.val == cur.val) {
//                while(cur.next != null && cur.next.val == cur.val) {
//                    cur = cur.next;
//                }
//                cur = cur.next;
//            } else {
//                tmp.next = cur;
//                tmp = tmp.next;
//                cur =  cur.next;
//            }
//            tmp.next = null;
//        }
//        return newHead.next;
//    }

    //二叉搜索树的第k个节点
//    ArrayList<TreeNode> list = new ArrayList<>();
//    TreeNode KthNode(TreeNode pRoot, int k) {
//        if(pRoot == null || k <= 0) return null;
//        midOrder(pRoot);
//        int size = list.size();
//        if(k > size) return null;
//        return list.get(k - 1);
//    }
//    void midOrder(TreeNode root) {
//        if(root == null) return;
//        midOrder(root.left);
//        list.add(root);
//        midOrder(root.right);
//    }
    public static void main(String[] args) {
//        int a = 10,b = 20;
//        int[] arr = {a,b};
//        swap(arr);
//        System.out.println("a = " + arr[0] + " " + "b = " + arr[1]);

//        String s = "abcXYZdef";
//        int n = 3;
//        String ss = LeftRotateString(s,n);
//        System.out.println(ss);
//        StringBuilder sb = new StringBuilder();

//        String s = "nowcoder. a am I";
//        System.out.println(ReverseSentence(s));

//        String s = "1a33";
//        int ret = Integer.parseInt(s);
//        System.out.println(ret);
//        List<Integer> list = new ArrayList<>();
//        list.remove(m - 1)

//        int n = 5;
//        int m = 3;
//        System.out.println(LastRemaining_Solution(n, m));
    }
}
