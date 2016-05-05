class Node{
  private static int count =0;
  private int data;
  private Node prev;
  private Node next;
  public Node(int data){
    this.data = data;
    this.prev = null;
    this.next = null;
    Node.increment();
  }
  private static void increment(){
    count+=1;
  }
  public static int getCount(){
    return Node.count;
  }
  public  int getData(){
    return this.data;
  }
  public  void setData(int data){
    this.data=data;
  }
  public   Node getNext(){
    return this.next;
  }
  public  void setNext(Node node){
    this.next=node;}
  public Node getPrev(){
    return this.prev;
  }
  public  void setPrev(Node node){
    this.prev = node;
  }
}
