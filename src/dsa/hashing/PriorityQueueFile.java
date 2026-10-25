package LB.Collection_Framework.Theory;

import java.util.*;
public class PriorityQueueFile {
    static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>((a,b) -> b-a);
        q.offer(10);
        q.offer(40);
        q.offer(5);
        q.offer(8);

        System.out.println(q);

        Queue<String> qq = new PriorityQueue<>();
        qq.offer("ffd");
        qq.offer("zwe");
        qq.offer("ddn");
        qq.offer("vkdnf");
        System.out.println(qq);
    }
}
