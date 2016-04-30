class TestList{
  public static void main(String[] args) {
    LinkedList node1 = new  LinkedList(1);
    LinkedList node2 = new  LinkedList(2);
    LinkedList node3 = new  LinkedList(3);
    LinkedList node4 = new  LinkedList(4);
    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    LinkedList head = node1;
    LinkedOp.traverse(head);
    System.out.println("*******");
    head = LinkedOp.insertStart(head,0);
    LinkedOp.traverse(head);
    System.out.println("*******");
    head = LinkedOp.insertPos(head,12,1);
    LinkedOp.traverse(head);
    System.out.println("*******");
    head=LinkedOp.deletePos(head,67);
    LinkedOp.traverse(head);
  }
}
