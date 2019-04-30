package phonedirectory;

import java.util.ArrayList;

public class Directory_Class {
    

    public String addFİRST(String number,String name,DoublyLinkedList Add){
        ArrayList<String> one = new ArrayList<String>();
        String result=null;
        if(name.equals("") || number.equals("")){
           result="\n♦ Please Enter The Name And Number";
        }else{
           one.add(number);
           info person_1=new info(name,one);
           Add.addFirst(person_1);
           result="\n♦ "+name+" Added To The Directory";
        
        }
       return result;
    }
    
    public String search(String name,DoublyLinkedList Add){
        String result=null;
        if(name.equals("")){
           result="\n♦ Please Enter The Name To Search";
        }else{
          result= Add.search(name);
        }
        return result;
    }
    
    public  String delete(String name,DoublyLinkedList Add){
        String result=null;
        if(name.equals("")){
           result="\n♦ Please Enter The Name To Be Deleted";
        }else{
          result= Add.delete(name);
        }
        return result;
    }
    public String display(DoublyLinkedList Add){
         return Add.display();  
    }
    public String reverse(DoublyLinkedList Add){
         return Add.reverse();  
    }
}
