import MyHashMap.MyHashMap;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(455);
        myList.add(4785);
        System.out.println(myList.get(1));
        System.out.println(myList.get(0));
        System.out.println("--------------------");
        myList.remove(7);
        System.out.println(myList.get(2));
        System.out.println(myList.size());
        System.out.println("------------");
        myList.clear();
        System.out.println(myList.size());
        //System.out.println(myList.get(0));
        myList.add(165);
        System.out.println(myList.get(1));

        /*MyLinkedList<Integer> list = new MyLinkedList();
        list.add(127);
        list.add(27);
        list.add(12);
        list.add(17);
        list.add(476);
        System.out.println(list.size());
        System.out.println(list.get(0));
        //list.clear();
        System.out.println(list.size());
        System.out.println("--------------------");
        list.remove(4);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));*/

        /*MyQueue <Integer> que = new MyQueue(5);
        que.add(345);
        que.add(34);
        que.add(45);
        que.add(65);
        que.add(109);
        System.out.println(que.size());
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que.size());*/

        /*MyStack <Integer> stack = new MyStack(5);
        stack.push(43);
        stack.push(53);
        stack.push(93);
        stack.push(101);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());*/

        /*MyHashMap <Integer, String> map = new MyHashMap();
        map.put(7, 54);
        map.put(12, 456);
        map.put(104, 450);
        map.put(3654, 144);
        map.put(3, 7498);
        map.put(571, 6401);
        System.out.println(map.size());
        System.out.println(map.get(12));
        System.out.println(map.get(571));
        System.out.println("----------------");
        map.remove(571);

        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.get(571));*/


    }
}
