package Method;

public class Calculator {

    //Method
    public  int  performArithematicOperatios(int x , int y){

        int z = x+y;
       if(z!=0)
        return z;
       else{
           return 0;
       }

    }


    public  static  void main(String args[]){
     Calculator c = new Calculator() ;
        int x = 6;
        int y = 4;
      c.performArithematicOperatios(x,y);
        int a =10;
        int b = 5;
        c.performArithematicOperatios(a,b);
        int c1 =10;
        int d = 5;
        c.performArithematicOperatios(c1,d);


    }
}
