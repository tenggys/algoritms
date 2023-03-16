package lessonwork3;

/* Задание 3
1. Реализуем метод поиска эл. в односвязном списке для проверки
наличия эл. внутри списка.
2. Для корректной работы со связным списком необходимо помнить,
 как именно можно обходить все значения внутри связного списка
3. Для нашего примера проще всего будет написать метод поиска значения в связном
списке и возврощения из метода информации о наличие искомого внутри списка

Public Node FindEl(int key){
}
*/


public class List3 {
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
            while(node != null) { // пока нод не будет нал
                if (node.value == key)
                    return node;
                node = node.nextNode;
            }
            return new Node();
        }
    }
    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("x" + x + "; y=" + y);
    }
}
