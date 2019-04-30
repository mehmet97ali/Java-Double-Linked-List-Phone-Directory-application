package phonedirectory;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    
    public DoublyLinkedList(){
		this.head = null; 
		this.tail = null;
    }
    public boolean IsEmpty(){
		return head == null;
    }
    public void addFirst(info inf){
	Node node = new Node(inf); 
        
	if (IsEmpty()){
           tail = node;
           head = node;
        } 
        else{
            head.prev = node; 
	    node.next= head; 
	    node.prev=null;
        }
        head = node; 
        alphabetical_insert(node);
    }
    public void alphabetical_insert(Node node){
        Node current=head;
        Node start=head;
        
        while(start!=null){
                current=start;
            if(start.next!=null){
                int compare=start.next.knowledge.nameSurname.compareTo(start.knowledge.nameSurname);
                if(compare<0){
                    info temp_1=current.knowledge;
                    current.knowledge=start.next.knowledge;
                    start.next.knowledge=temp_1;
                }else if(compare>0){
                    
                    
                }
            }
            start=start.next;
        }
    }
    public String search(String wanted){
       boolean found=false;
       String result=null;
       Node start=head;
       
       while(start!=null){
        if(wanted.equals(start.knowledge.nameSurname)){
           result = start.toString();
           found=true;
        }
        start=start.next;
       }
       if(found==false){
           result="\n♦ Not Found";
       }
       return result;
    }
    public String delete(String deleted){
        boolean found=false;
        Node deletedNode=null;
        Node start=head;
        String result=null;
        while(start!=null){
            if(deleted.equals(start.knowledge.nameSurname)){
               deletedNode=start;
               found=true;
            }
            start=start.next;
        }
        if(found==false){
            result="\n♦ Not Found";
        }else if (found == true){
            if (head == null || deletedNode == null) { 
                result="\n♦ Directory Is Empty"; 
            }else{
                if (head == deletedNode) { 
                    head = deletedNode.next; 
                } 
                if (deletedNode.next != null) { 
                    deletedNode.next.prev = deletedNode.prev; 
                } 
                if (deletedNode.prev != null) { 
                    deletedNode.prev.next = deletedNode.next; 
                }
                result="\n♦ "+deleted+"\t Has Been Deleted From Directory";
            } 
        }
        return result; 
    }
    
    public String display(){
       Node start=head;
       String result="";
       while(start!=null){
            result+="\n"+start.toString();
            start=start.next;
       }
       return result;
    }
    
    public String reverse(){
       Node start=tail;
       String result="";
       while(start!=null){
            result+="\n"+start.toString();
            start=start.prev;
       }
       return result;
    }
    
}
