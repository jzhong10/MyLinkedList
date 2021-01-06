public class Node {
  
 private String data;
 private Node next, prev;
 //write get/set methods for all three instance variables.
 
 public Node (String value) {
   data = value;
 }
 
 public String get() {
   return value;
 }
 
 public String set(String value) {
   String temp = this.get();
   data = value;
   return temp;
 }
 
 
}