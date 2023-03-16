package lessonwork3;

/*
Задание 4
1ю Реализуем метод добавления новых эл в конец списка и удаление последнего эл связного списка
2.Теперь, когда мы понимаем, как можно искать значение внутри связного списка,
мы можем сделать метод добавления и удаления эл в конец нашего односвзного списка
 */

public class List4 {
    public class LinkedList {
        private Node head;
        private Node tail;

        class Node{
            private int value; // значение
            private Node nextNode; // ссылка на следующее значение
        }

        public void AddFirst(int value) { //принимает целое число
            Node node = new Node(); // созд нов эл.
            node.value = value; //запис кот хранилось в value
            node.nextNode = head; // ссылка на след эл
            head = node; // то что было написано в Node
        }

        public void DellFirst(){
            head = head.nextNode;
        }

        public Node NodeFind(int key) {//ищем об и возвращаем
            Node node = head; // нов нод
            while(node.nextNode != null) {
                Node temp = node.nextNode;
                if (temp.value == key)
                    return temp;
                node = temp;
            }
            return new Node();
        }
        public void LastAdd(int value) { // тут решение
            Node node = new Node(); // созд нов об
            node.value = value;
            tail.nextNode = head;
            tail = node;
        }
        public void DeleteLast() { // уд посл эл
            Node node = head;
            while (node.nextNode != tail) {
                node = node.nextNode;
            }
            tail = node;
            tail.nextNode = new Node();
        }
    }

    public static void main(String[] args) {
    }
}
