class LinkStackTest{
  public static void main(String[] args) {
    Stack stack1 = new Stack(0);
    stack1.top=stack1.push(1);
    stack1.top=stack1.push(2);
    stack1.top=stack1.push(3);
    stack1.display();
    System.out.println("Popped data is "+stack1.pop());
    stack1.display();

  }

}
class Stack{
  public  LinkedList top;
  public Stack(int data){
    top=new LinkedList(data);
  }
  public LinkedList push(int data){
    LinkedList temp= new LinkedList(data);
    temp.setNext(top);
    top=temp;
  return  top;}
  public int pop(){
    if (this.top==null){return -1;}
    LinkedList p = top;
    top=p.getNext();
    return p.getData();
  }
  public void display(){
    LinkedList p =top;
    System.out.println("Displaying data");
    while (p!=null){
      System.out.println(p.getData());
      p=p.getNext();
    }
  }

}
