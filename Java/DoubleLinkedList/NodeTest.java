import java.util.Scanner;
class NodeTest{
  private static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {


    Node start;
    start=NodeOp.create();
    NodeOp.traverse(start);
    System.out.println("Enter element to insert");
    int element=reader.nextInt();
    System.out.println("Enter position to insert");
    int pos=reader.nextInt();
    start=NodeOp.insertPos(start,element,pos);
    System.out.println("Inserting element "+element +"at position "+pos);
    NodeOp.traverse(start);
    System.out.println("Enter position to delete");
    pos=reader.nextInt();
    start=NodeOp.delPos(start,pos);
    System.out.println("Deleting element at position "+ pos);
    NodeOp.traverse(start);
    //NodeOp.readReverse(start);
    System.out.println("Reversing the list");
    start=NodeOp.reverse(start);
    NodeOp.traverse(start);
    NodeOp.readReverse(start);
  }
}
