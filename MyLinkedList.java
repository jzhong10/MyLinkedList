public class MyLinkedList {
  private int size;
  private Node start, end;
  
  public MyLinkedList() {/*create a constructor*/
    size = 0;
    Node n = new Node();
    start = n;
    end = n;
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
        end.setPrev(start); //
    } else {
        end.setNext(n);
        n.setPrev(end);
        end = n;
    }
    size++;
    return true;
  }
  
  public void add(int index, String value) {
    if (index<0 || index > this.size()) {
      throw new IndexOutOfBoundsException();
    }
    
    Node insert = new Node(value);
    
    if (this.size()!=0 && index==0) {
      start.setPrev(insert);
      insert.setNext(start);
      start = insert;
    } else if (index==this.size()) {
        this.add(value);
        size--;
    } else {
        Node n = getNode(index);
        Node l = n.getPrev();
        
        l.setNext(insert);
        insert.setNext(n);
        
        n.setPrev(insert);
        insert.setPrev(l);
    } 
    size++;
  }
  
  public String set(int index, String value) {
    if (index<0 || index >= this.size()) {
      throw new IndexOutOfBoundsException();
    }
    
    Node insert = new Node(value);
    Node n = getNode(index);
    
    String retstr = n.get();
    
    if (index==0) {
      Node r = n.getNext();
      r.setPrev(insert);
      insert.setNext(r);
      start = insert;
    } else if (index==this.size()-1) {
        Node l = n.getPrev();
        l.setNext(insert);
        insert.setPrev(l);
        end = insert;
    } else {
        Node l = n.getPrev();
        Node r = n.getNext();
        l.setNext(insert);
        insert.setPrev(l);
        insert.setNext(r);
        r.setPrev(insert);
    }
    
    return retstr;
  }
  
  public String get(int index) {
    if (index<0 || index >= this.size()) {
      throw new IndexOutOfBoundsException();
    }
    
    Node n = getNode(index);
    return n.get();
  }
  
  public String remove(int index) {
    if (index<0 || index >= this.size()) {
      throw new IndexOutOfBoundsException();
    }
    
    Node n = getNode(index);
    String retstr = n.get();
    
    if (index==0) {
      Node r = start.getNext();
      r.setPrev(new Node());
      start = r;
    } 
    if (index==size-1) {
        Node l = end.getPrev();
        l.setNext(new Node());
        end = l;
    } else {
        Node r = n.getPrev();
        Node l = n.getNext();
        r.setNext(l);
        l.setPrev(r);
    }
    
    size--;
    return retstr;
  }
  
  public void extend(MyLinkedList other) {
    while (other.size()>0) {
      this.add(other.remove(0));
    }
  }
  
  public String toString() {
    String retstr = "[";
    Node n = start;
    while (n.getNext()!=null) {
      retstr += n.get();
      retstr += ", ";
      n = n.getNext();
    }
    if (retstr.length()>=2) {
      retstr = retstr.substring(0, retstr.length()-2);  
    }
    retstr += "]";
    return retstr;
  }
  
  //my tester used this function initially and I didn't want to change all the Rev to reversed
  public String toStringRev() {
    String retstr = "[";
    Node n = end;
    while (n.getPrev()!=null) {
      retstr += n.get();
      retstr += ", ";
      n = n.getPrev();
    }
    if (retstr.length()>=2) {
      retstr = retstr.substring(0, retstr.length()-2);
      
    }
    retstr += "]";
    return retstr;
  }
  
  public String toStringReversed() {
    String retstr = "[";
    Node n = end;
    while (n.getPrev()!=null) {
      retstr += n.get();
      retstr += ", ";
      n = n.getPrev();
    }
    if (retstr.length()>=2) {
      retstr = retstr.substring(0, retstr.length()-2);
      
    }
    retstr += "]";
    return retstr;
  }

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