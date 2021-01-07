public class Node {
  
 private String data;
 private Node next, prev;
 //write get/set methods for all three instance variables.
 
 public Node(String value) {
   data = value;
   next = new Node();
   prev = new Node();
 }
 
 public Node() {
   
 }
 
 public String get() {
   return data;
 }
 
 public String set(String value) {
   String temp = this.get();
   data = value;
   return temp;
 }
 
 public Node getNext() {
   return next;
 }
 
 public Node getPrev() {
   return prev;
 }
 
 public Node setNext(Node n) {
   Node temp = next;
   next = n;
   return temp;
 }
 
 public Node setPrev(Node n) {
   Node temp = prev;
   prev = n;
   return temp;
 }
}