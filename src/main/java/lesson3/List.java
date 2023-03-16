package lesson3;

public class List {
    Node head; //описвает начало списка
    Node tail;

    public  void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public Integer peek(){
        Integer result = null;
        if (tail != null){
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return  result;
    }

    public  Integer pop() { // стэк
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode){ // односвязный список разворот
        if (currentNode.next == null){
            head = currentNode;
        }else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }

 /*   public void add(int value) {//доб эл. в связный спико
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public  void  add(int value, Node node) {//доб эл. в свзн. список
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        }else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        }else {
            if (next == null){
                previous.next = null;
                tail = previous;
            }else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    public Node find(int value) { // поиск нужного эллемента
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return  currentNode;
            }
            currentNode = currentNode.next;
        }
        return  null;
    }

    //разворот связного списка
    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;// обработка событий
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }*/
// конец
    public class Node {
        int value; //значение
        Node next; //опис след эл списка
        Node previous;
    }
}
