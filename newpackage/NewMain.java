package newpackage;
public class NewMain {

    public static void main(String[] args) {
        Integer num[]={1,6,5,9,10};
        sample s=new sample();
        s.min(num);
    }    
}
class sample{
    < T extends Comparable<T>> void min(T[]y)
    {
        T min;
        min=y[0];
        for(int i=1;i<y.length;i++ )
        {
         if(min.compareTo(y[i])>0){       
             min=y[i];
         }        
        }
        System.out.println(min);   
    }
}

