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
  
  public void add(int index, String value) {
    if (index<0 || index > this.size()) {
      throw new IndexOutOfBoundsException();
    }
    
    Node insert = new Node(value);
    
    if (index==0) {
      insert.setNext(start);
      start = insert;
    } else if (index==this.size()) {
        this.add(value);
    } else {
        Node rightNode = getNode(index);
        Node leftNode = getNode(index-1);
        leftNode.setNext(insert);
        insert.setNext(rightNode);
    } 
    size++;
  }
  
  public String get(int index) {
    Node n = getNode(index);
    return n.get();
  }
  
  public String toString() {
    String retstr = "[";
    Node n = start;
    while (n.getNext()!=null) {
      retstr += n.get();
      retstr += ", ";
      n = n.getNext();
    }
    retstr = retstr.substring(0, retstr.length()-2);
    retstr += "]";
    return retstr;
  }
  /*
  public boolean add(int index, String value);
  public String set(int index, String value);
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