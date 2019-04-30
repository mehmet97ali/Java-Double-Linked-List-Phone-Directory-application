package phonedirectory;

public class Node {
    public Node prev;
    public Node next;
    public info knowledge;
    
    
    public Node(info knowledge){

       this.knowledge=knowledge;
    }
    public String toString(){
    
      return "\n  • "+knowledge.nameSurname+"            "+knowledge.phoneNumbers;
    }
}
