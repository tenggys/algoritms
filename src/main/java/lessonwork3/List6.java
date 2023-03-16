package lessonwork3;
/*1, Обновляем методы согласно новой структуре
Появилась доп переменная, кот необходимо отслеживать
во всех операциях
3.Так же благодаря ссылке на последний эл списка операции работы с
концом стали проще и их стоит заменить на логику аналогичную работе с началом списка
*/
public class List6 {
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
            head.previousNode = node; //
            node.nextNode = head;
            head = node;
        }

        public void DellFirst() {
            Node node = head;
            head.nextNode.previousNode = new Node();
            head = head;
        }

        public Node NodeFind(int key) {//ищем об и возвращаем
            Node node = head; // нов нод
            while (node.nextNode != null) { // пока нод не будет нал
                Node temp = node.nextNode;
                if (temp.value == key)
                    return temp;
                node = temp;
            }
            return new Node();
        }

        public void DeleteList() {
            Node node = tail.previousNode;
            node.nextNode = new Node();
            tail = node;
        }

        public void LastAdd(int value) {
            Node node = new Node();
            node.value = value;
            tail.nextNode = node;
            tail.previousNode = tail;
            tail = node;
        }
    }
}

