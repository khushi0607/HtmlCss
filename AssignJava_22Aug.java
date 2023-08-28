
class singleton {
   static singleton obj=null;
    private singleton(){
    };
    
    public static singleton singleton_obj()
    {
        if(obj==null)
            obj=new singleton();

        return obj;
    }
}

public class singleton12
{
    public static void main(String[] args) {

      singleton s= singleton.singleton_obj();
      singleton s1=singleton.singleton_obj();
        System.out.println(s.hashCode()+"  "+s1.hashCode());
      s.fun();

    }
}
