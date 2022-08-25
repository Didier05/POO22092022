package linkedlist;

public class NodeHead {
    NodeList head;
    NodeHead(int value) {
        head = new NodeList();
        head.value = value;
    }
    
    void agregarAlInicio(int value){
        NodeList temp = new NodeList();
        temp.value = value;
        temp.next = head;
        this.head = temp;
    }
    
    void agregarAlFinal(int value) {
        NodeList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        NodeList newNode = new NodeList();
        newNode.value = value;
        
        temp.next = newNode;
    }
    
    void imprime() {
        NodeList temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    
}
