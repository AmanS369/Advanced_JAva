import java.util.Scanner;  

  

public class college {  

  

    String name;  

  

    int age;  

  

    String program;  

  

   public college(String name,int age,String program) {  

  

   

  

         this.name=name;      

  

         this.age=age;  

  

         this.program=program;  

  

}  

  

   

  

public static class Graduate extends college{  

  

      int marks;  

  

      String stream;  

  

Graduate(String name,int age,String program,int marks,String stream) {  

  

       super(name,age,program);  

  

       this.marks=marks;  

  

       this.stream=stream;  

  

}  

  

void display_student_info( ) {  

  

   

  

System.out.println("The name of the Graduate is "+name);  

  

System.out.println("The age of the Graduate is "+ age);  

  

System.out.println("The program of the Graduate is "+program);  

  

System.out.println("The marks of the Graduate is "+marks);  

  

System.out.println("The stream of the Graduate is "+stream);  

  

}  

  

}  

  

public static class res extends college {  

  

        int experience;  

  

        public res(String name,int age,String program,int experience) {  

  

        super(name,age,program);  

  

        this.experience=experience;  

  

}  

  

void display_student_info( ) {  

  

System.out.println("the name of the Research is "+name);  

  

System.out.println("the age of the Resaercher  is "+ age);  

  

System.out.println("the programe enrolled by Reasearcher is "+program);  

  

System.out.println("the experience of the Researcher is "+ experience);  

  

}  

  

}  

  

   

  

   

  

public static void main(String[] args) {  

  

    Scanner sc= new Scanner(System.in);  

  

System.out.println("the details of grad student is \n");  

  

System.out.println("name,age,program,percent,stream");  

  

String grad_name=sc.nextLine();  

  

int grad_age=sc.nextInt();  

  

String grad_program=sc.next();  

  

int grad_percent=sc.nextInt();  

  

String grad_stream=sc.next();  

  

Graduate obj= new Graduate (grad_name,grad_age,grad_program,grad_percent,grad_stream);  

  

obj.display_student_info();  

  

System.out.println("\n");  

  

System.out.println("the details of research student is \n");  

  

System.out.println(" name, age,program,no of working experience,");  

  

String re_name=sc.nextLine();  

  

int re_age=sc.nextInt();  

  

String re_program=sc.nextLine();  

  

int re_year=sc.nextInt();  

  

   

  

res obr= new res(re_name,re_age,re_program,re_year);  

  

obr.display_student_info();  

  

   

  

}  

  

}  