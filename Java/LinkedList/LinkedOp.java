class LinkedOp{
  private static int count=0;
public static int len(LinkedList head){
  LinkedList first = head;
  while (first!=null){
    count+=1;
    first=first.getNext();
  }
  return count;
}
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
public static LinkedList reverse(LinkedList beg){
  LinkedList prev,curr,next;
  prev=null;
  curr=beg;
  while(curr!=null){
    next=curr.getNext();
    curr.setNext(prev);
    prev=curr;
    curr=next;
  }
  return prev;
  }
public static LinkedList sort(LinkedList beg){
  System.out.println("Printing the sorted list");
LinkedList p,q;
for (p=beg;p.getNext().getNext()!=null;p=p.getNext()){
  for(q=p.getNext();q.getNext()!=null;q=q.getNext()){
    if (p.getData()>q.getData()){
      int temp=p.getData();
      p.setData(q.getData());
      q.setData(temp);
    }
  }
} return beg;

    }
  }
