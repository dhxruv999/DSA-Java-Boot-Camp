class node{
    int data;
    node next;
    
    node(int data){
        this.data=data;
        this.next=null;
    }
    
}
public class Main
{
    static node head = null;
    public static void traversal(){
        if(head == null){
            System.out.println("LinkedList is null"); 
            return;
            }
        node temp = head;
        temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ->-> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    
    public static void insertAtHead(int data){
        node newNode = new node(data);
        newNode.next = head;
        
        head = newNode;
        
    }
    
    public static void insertAtEnd(int data){
        node newNode = new node(data);
        node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    
    public static void insertAtAnyGivenPosition(int data, int position){
        node newNode = new node(data);
        node temp = head;
        for (int i = 1; i < position - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
	public static void main(String[] args) {
		insertAtHead(10);
		insertAtHead(20);
		insertAtEnd(30);
		insertAtAnyGivenPosition(35,3);
        traversal();
	}
}
