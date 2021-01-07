public class MyLinkedList {
  private int size;
  private Node start, end;
  
  public MyLinkedList() {/*create a constructor*/
    size = 0;
    start = new Node();
    end = new Node();
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
        end = n;
    } else {
        end.setNext(n);
    }
    size++;
    return true;
  }
  
  /*
  public boolean add(int index, String value);
  public String get(int index);
  public String set(int index, String value);
  public String toString() {
    
  }
  */
  //Any helper method that returns a Node object MUST BE PRIVATE!
}