import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueClass {
    public static void main(String[] args){
        Queue<Integer> queueOf = new PriorityQueue<>();

        queueOf.add(12);
        queueOf.add(23);
        queueOf.add(34);
        queueOf.add(45);
        queueOf.offer(56);
        queueOf.offer(67);

        System.out.println("after Offer and Add: "+ queueOf);
        System.out.println("using poll() method: "+queueOf.poll());
        System.out.println("peek of the element is: "+queueOf.peek());
        System.out.println("removing the element form queue: "+queueOf.remove(56));
        System.out.println("check contains or not: "+queueOf.contains(23));
        System.out.println("element from the queue: "+queueOf.element());
        System.out.println("element2 from the queue: "+queueOf.element());
        System.out.println("entire queue is: "+queueOf);

        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("know");
        arrayListOne.add("don't know!");
        arrayListOne.add("fund");
        arrayListOne.add("not found!");
        System.out.println("arraylist new: "+arrayListOne);

        Queue<String> queueString = new PriorityQueue<>();
        queueString.addAll(arrayListOne);
        System.out.println("queue string is: "+queueString);
    }
}
