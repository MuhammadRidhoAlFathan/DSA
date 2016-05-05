import java.util.Scanner;
class UserInput{
  private static Scanner reader = new Scanner(System.in);
  private static  int[] a;
  public static void getArray(int n){
    a = new int[n];
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter "+n+" numbers");
    for( int i=0;i<n;i++){
      a[i]=reader.nextInt();
    }
  }
  public  static void display(int[] a){

  for (int i =0;i<UserInput. a.length;i++){
    System.out.println(a[i]);
  }

  }
  public static void main(String[] args) {
    System.out.println("Enter the length of array");
    int len = reader.nextInt();
    UserInput.getArray(len);
    UserInput.display(a);

  }
}
