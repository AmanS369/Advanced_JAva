class mutli1 extends Thread { 
 
    public void run() { 
        try { 
            for (int i = 0; i <= 5; i++) { 
                if (i % 2 == 0) { 
                    System.out.println(i + "Even"); 
                    Thread.sleep(200); 
                } 

            } 
        } catch (Exception e) { 
            System.out.println("Exception is caught"); 

        } 

    } 
} 
class mutli2 extends Thread{ 
   public void run() { 
       try { 
           for (int i = 0; i <= 5; i++) { 
               if (i %2!= 0) { 
                   System.out.println(i + "ODD"); 
                   Thread.sleep(500); 
               } 

           } 
       } catch (Exception e) { 
           System.out.println(e); 

       } 

   } 
} 
class multi { 
       public static void main(String[] args) { 
           Thread obj1=new Thread(new mutli1()); 
           obj1.start(); 
           Thread obj2=new Thread(new mutli2()); 
           obj2.start(); 


       } 
   } 

