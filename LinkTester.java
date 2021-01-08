public class LinkTester {
  public static void main(String[] args) {
    /*
    MyLinkedList link = new MyLinkedList();
    System.out.println(link.size());
    link.add("hello0");
    System.out.println(link.size());
    link.add("hello1");
    System.out.println(link.size());
    link.add("hello2");
    System.out.println(link.size());
    link.add("hello3");
    System.out.println(link.size());
    link.add("hello4");
    System.out.println(link.size());
    link.add("hello5");
    System.out.println(link.size());
    
    System.out.println();
    for (int i = 0; i<link.size(); i++) {
      System.out.println(i);
      System.out.println(link.get(i));
    }
    System.out.println(link.toString());
    
    link.add(0, "haa?");
    System.out.println(link.toString());
    
    link.add(1, "hmmm");
    System.out.println(link.toString());
    link.add(4, "hmmm");
    System.out.println(link.toString());
    
    link.set(0, "8ball");
    System.out.println(link.toString());
    
    link.set(link.size()-1, "8ball");
    System.out.println(link.toString());
    
    link.set(1, "8ball");
    System.out.println(link.toString());
    System.out.println(link.toStringRev());
    */
    System.out.println("\nthe reverse quest\n");
    
    MyLinkedList linked = new MyLinkedList();
    for (int i = 0; i<5; i++) {
      linked.add(i+"");
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    System.out.println(linked.toString());
    System.out.println(linked.toStringRev());
    
    for (int i = 0; i<2; i++) {
      linked.add(0, -1+"");
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    
    for (int i = 0; i<2; i++) {
      linked.add(linked.size(), -5+"");
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    
    for (int i = 2; i<4; i++) {
      linked.add(i, "a");
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    
    System.out.println("set testing");
    
    for (int i = 0; i<2; i++) {
      linked.set(0, "!");
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    
    for (int i = 0; i<2; i++) {
      System.out.println(linked.size());
      linked.set(linked.size()-1, "?");
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    
    for (int i = 1; i<4; i++) {
      linked.set(i, "*");
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
    }
    
    System.out.println("\nremove testing\n");
    
    int count = 0;
    while (count<linked.size()) {
      linked.remove(0);
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringRev());
      //count++;
    }
    //linked.add("hi");
    for (int i = 0; i<10; i++) {
      linked.add(0, ""+ i);
    }
    System.out.println(linked.toString());
    System.out.println(linked.toStringReversed());
    
    int n = linked.size();
    for (int i = 1; i<n-1; i++) {
      linked.remove(1);
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringReversed());
    }
    linked.remove(1);
    linked.remove(0);
    System.out.println(linked.toString());
    System.out.println(linked.toStringReversed());
    for (int i = 0; i<10; i++) {
      linked.add(0, ""+ i);
    }
    
    while (linked.size()>0) {
      linked.remove(linked.size()-1);
      System.out.println();
      System.out.println(linked.toString());
      System.out.println(linked.toStringReversed());
    }
  }
}
