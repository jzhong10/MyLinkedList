public class MyLinkedList {
  private int size;
  private Node start, end;
  
  public MyLinkedList() {/*create a constructor*/
    size = 0;
    start = new Node();
    end = new Node();
    start.setNext(end);
  }

  public int size() {
    return size;
  }
  
  public boolean add(String value) {
    Node n = new Node(value);
    if (size==0) {
      start = n;
      end = n;
    } else if (size==1) {
        start.setNext(n);
        end = start.getNext();
    } else {
        end.setNext(n);
        end = end.getNext();
    }
    size++;
    return true;
  }
  
  public String get(int index) {
    Node n = getNode(index);
    return n.get();
  }
  
  /*
  public boolean add(int index, String value);
  public String set(int index, String value);
  public String toString() {
  }
  */

  //Any helper method that returns a Node object MUST BE PRIVATE!
  private Node getNode(int index) {
    int count = 0;
    Node n = start;
    while (count<index) {
      n = n.getNext();
      count++;
    }
    return n;
  }
}