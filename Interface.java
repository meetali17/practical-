interface A{
public void met1();
public void met2();
}
interface B{
public void met3();
}
class C implements A,B{
public void met1(){
System.out.println("Hii");
}
public void met2(){
System.out.println("Hello");
}
public void met3(){
System.out.println("How are you");
}
}
public class Interface{
public static void main(String[] args){
C obj=new C();
obj.met1();
obj.met2();
obj.met3();
}
}

