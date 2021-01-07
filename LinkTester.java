public class LinkTester {
  public static void main(String[] args) {
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
  }
}
