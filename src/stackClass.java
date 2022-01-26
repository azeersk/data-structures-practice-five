import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class stackClass {
    public static void main(String[] args){
        Stack<String> names = new Stack<>();
        names.add("sathya nadhella");
        names.push("juff bejos");
        names.add("sunder pichai");
        names.push("a.p.j abdul kalam");
        names.push("narendra modi");
        System.out.println("after push(): "+names);
        System.out.println("after pop(): "+names.pop());
        System.out.println("Stack empty check: "+names.empty());
        System.out.println("Stack peek of the element: "+names.peek());
        System.out.println("Search for the element: "+names.search("sunder pichai"));
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ambani");
        arrayList.add("tharak mehatha");
        arrayList.add("array list");
        System.out.println(arrayList);

        names.addAll(arrayList);
        System.out.println(names);

        Stack<Integer> numbers = new Stack<>();
        numbers.add(1);
        numbers.add(23);
        numbers.push(345);
        numbers.push(554);
        System.out.println(numbers);
        for(int e: numbers){
            System.out.print(e + " " );
        }

        System.out.println();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.addAll(numbers);
        arrayList1.addAll(arrayList1);
        System.out.println(arrayList1);
    }
}
