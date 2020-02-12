package exercise1;
interface FuncInterface 
{ 
    void abstractFun(int x,int y);  
} 
  class First
{ 
    public static void main(String args[]) 
    { 
        FuncInterface fobj = (int a,int b)->System.out.println(Math.pow(a, b)); 
        fobj.abstractFun(5,9); 
    } 
} 
  
  
