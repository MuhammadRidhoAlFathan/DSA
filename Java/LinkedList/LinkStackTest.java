class LinkStackTest{
  public static void main(String[] args) {
    LinkedList head=LinkedOp.createStack();
    head=LinkedOp.push(head);
    head=LinkedOp.push(head);
    head=LinkedOp.push(head);
    System.out.println("Traversing a stack");
    LinkedOp.traverse(head);
    System.out.println("Popping a value");
    int data=LinkedOp.pop(head);
    System.out.println(data+"*0000");
    System.out.println("Traversing after popping");
    LinkedOp.traverse(head);
  }

}
