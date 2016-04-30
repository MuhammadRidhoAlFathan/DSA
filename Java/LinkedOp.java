class LinkedOp{
public static void traverse(LinkedList head){
LinkedList first = head;
while (first!=null){
System.out.println(first.getData());
first= first.getNext();
}
}
public static LinkedList insertStart(LinkedList beg,int data){
  LinkedList temp = new LinkedList(data);
  if (beg==null){
    return temp;
  }
  else {
    temp.setNext(beg);
    beg =temp;
    return beg;
  }
}
public static LinkedList insertPos(LinkedList beg, int data,int pos){
  if (pos==1){beg=insertStart(beg,data);
  return beg;}
    else{
  int count =1;
  LinkedList first = beg;
  while (count<pos-1 ){
    first=first.getNext();
    count+=1;
    if (first.getNext()==null){
      System.out.println("Invalid position");
      return beg;
    }
  }
  LinkedList temp = new LinkedList(data);
  temp.setNext(first.getNext());
  first.setNext(temp);
  return beg;}

}
public static LinkedList deletePos(LinkedList beg,int pos){
  if (pos==1){
    LinkedList temp = beg.getNext();
    beg.setNext(null);
    return temp;
  }
  else{
    int count =1;
    LinkedList first = beg;
    while (count<pos-1){
      first = first.getNext();
      count+=1;
      if (first.getNext()==null){
        System.out.println("Invalid position");
        return beg;}
    }
    LinkedList temp = first.getNext();
    first.setNext(temp.getNext());
    return beg;
  }
}
}
