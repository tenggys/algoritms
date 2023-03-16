package lessonwork3;

/*Задание 2
1. Реализуем метод добавления новых элементов в начало списка и удаление
первого элемента связного списка.
2. Однозначный список всегда имеет ссылку на первый элемент
последовательности, потому именно с реализацией методов для первого элемента последовательности стоит начать
 */

public class List2 {
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
            if(tail == null)
                tail = node;
            node.nextNode = head; // ссылка на след эл
            head = node; // то что было написано в Node
        }

        public void DellFirst(){
            head = head.nextNode;
        }
    }
    public static void main(String[] args) {

    }
}

