package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        NodeHead linkedList = new NodeHead(5);
        linkedList.agregarAlFinal(7);
        linkedList.agregarAlFinal(8);
        linkedList.agregarAlFinal(9);
        linkedList.agregarAlInicio(3);
        linkedList.agregarAlInicio(2);
        
        linkedList.imprime();
    }
    
}
