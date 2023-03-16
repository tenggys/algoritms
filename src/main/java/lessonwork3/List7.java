package lessonwork3;
//Добавляем метод сортировки для связого спика
public class List7 {
    public class LinkedList {
        private Node head;
        private Node tail;

        class Node {
            private int value; // значение
            private Node nextNode; // ссылка на следующее значение
            private Node previousNode;
        }

        public void AddFirst(int value) {
            Node node = new Node();
            node.value = value;
            node.nextNode = head;
            head = node;
        }

        public void DellFirst() {
            head = head.nextNode;
        }
        public void sortList() {
            Node current = head, index = new Node();
            int temp;

            if (head == null) {
                return;
            } else {
                while (current != null) {
                    index = current.nextNode;
                    while (index != null) {
                        if (current.value > index.value) {
                            temp = current.value;
                            current.value = index.value;
                            index.value = temp;
                        }
                        index = index.nextNode;
                    }
                    current = current.nextNode;
                }
            }
        }

        public void NodeFind (int key) {
            Node node = head;
            while (node.nextNode != null) {
                Node temp = node.nextNode;
                if (temp.value == key)
                    return temp;
                node = temp;
            }
            return new Node();
        }
    }
}
