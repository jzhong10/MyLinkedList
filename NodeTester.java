public class NodeTester {
  public static void main(String[] args) {
    Node n = new Node("hi");
    System.out.println(n.get());
    n.set("bye");
    System.out.println(n.get());
    
    Node n1 = n.getNext();
    System.out.println(n1.get());
    System.out.println(n1.set("hello"));
    System.out.println(n1.get());
  }
}
