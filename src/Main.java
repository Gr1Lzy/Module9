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
    }
}