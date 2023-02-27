import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        System.out.println(myArrayList);
        myArrayList.get(2);
        myArrayList.size();
        myArrayList.clear();
        System.out.println(myArrayList);
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.size();
        myArrayList.add("6");
        myArrayList.add("7");
        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println("____________________________________");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        System.out.println(myLinkedList);
        myLinkedList.size();
        myLinkedList.add("4");
        myLinkedList.add("5");
        myLinkedList.add("6");
        myLinkedList.add("7");
        myLinkedList.remove(0);
        myLinkedList.size();
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);
        myLinkedList.size();
    }
}