public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;

//    add last
    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

    }

//    add first
    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            first.next = first;
            first = node;
        }
    }

//    check empty
    private boolean isEmpty() {
        return first == null;
    }

//    index of node
    public  int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;

    }
//    contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

}
