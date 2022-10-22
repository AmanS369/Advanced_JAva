// program describe the concept of function overloading 




import java.util.Scanner;

class HelloWorld {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("enter the length,breath and height of the rectangle");

int l = in.nextInt();

int b = in.nextInt();

int h = in.nextInt();

System.out.println("enter the side of the square");

int s = in.nextInt();

System.out.println("the area of the rectangle is"+area(l,b,h));

System.out.println("the area of the square is "+ area(s));

}

public static int area(int a , int b, int c){

return a*b*c;

}

public static int area(int a ){

return a*a;

}

}
