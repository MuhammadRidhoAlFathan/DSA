//euclid algorithm depiction in Java
class Euclid{
  public static int euclid(int p, int q){
    //System.out.printf("%d,%d",p,q);
    if (q==0){
      return p;
    }
    else {
      return euclid(q,p%q);
    }
  }
  public static void main(String args[]){
    System.out.println(Euclid.euclid(12,5));
  }
}
