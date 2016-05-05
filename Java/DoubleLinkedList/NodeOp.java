import java.util.Scanner;
class NodeOp{
  private static int[] a;
  private static Scanner reader = new Scanner(System.in);
  public  static void traverse(Node start){
    int mycount=0;
    Node p = start;
    while (p!=null) {
      System.out.println(p.getData());
      mycount+=1;
      p=p.getNext();
    }
    System.out.println("the total number of nodes is "+mycount);
  }
  public static Node insertStart(Node start,int val){
    Node p=start;
    if (p==null) {
      Node temp = new Node(val);
      return temp;
    }
    else{
      Node q = new Node(val);
      q.setNext(p);
      p.setPrev(q);
      return q;
    }
  }
  public static  Node insertPos(Node start,int data,int pos){
    if (pos==1) {
      start=insertStart(start,data);
      return start;
    }
    else if (pos>Node.getCount()+1||(pos<1)){
      System.out.println("Invalid position");
      return start;
    }
    else{
      Node p=start;
      int i=1;
      while(i<pos-1){
        p=p.getNext();
        i++;
      }
    Node q = new Node(data);
    q.setNext(p.getNext());
    q.setPrev(p);
    if (p.getNext()!=null) {
      p.getNext().setPrev(q);
    }
    p.setNext(q);
      return start;
    }
  }
  public static void getArray(int n){
    a = new int[n];
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter "+n+" numbers");
    for( int i=0;i<n;i++){
      a[i]=reader.nextInt();
    }
  }
  public static Node create(){
    System.out.println("Enter the length of linked list");
    int len = reader.nextInt();
    NodeOp.getArray(len);
    Node start=null;
    //int[] a = {1,5,3,2,6};
      for(int i=0;i<a.length;i++){
        start = insertPos(start,a[i],i+1);
      }
    return start;
  }
  public static Node delPos(Node start,int pos){
    Node p,q;
    if (pos>Node.getCount()||(pos<1)){
      System.out.println("Invalid Position");
    }
    else{
        p=start;
        int i =1;
      while(i<pos-1){
        p=p.getNext();
        i++;
      }
      q=p.getNext();
      if (q.getNext()!=null){
        q.getNext().setPrev(p);
      }
      p.setNext(q.getNext());
      q.setNext(null);q.setPrev(null);
    }
    return start;

  }
  public static  void readReverse(Node start){
    Node p=start;
    if (p!=null) {
      while (p.getNext()!=null) {
        p=p.getNext();
      }
    }
    System.out.println("Reading reverse");
    while(p!=null){
      System.out.println(p.getData());
      p=p.getPrev();
    }
  }
  public static Node reverse(Node start){
    Node prev,curr,next;
    curr=start;
    while(curr!=null){

      next=curr.getNext();
      curr.setNext(curr.getPrev());
      curr.setPrev(next);
      if(next==null){return curr;}
      curr=next;

    }
    return curr;
  }

    }
