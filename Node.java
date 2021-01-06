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
 
 public String getNext() {
   return next.get();
 }
 
 public String setNext(String value) {
   return next.set(value);
 }
 
 public String getEnd() {
   return end.get();
 }
 
 public String setEnd(String value) {
   return end.set(value);
 }
}