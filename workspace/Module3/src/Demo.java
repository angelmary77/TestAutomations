class Demo{
static int var=9;
public static void func(){
System.out.println("learning static keyword");
}

public static void main(String s[]){
	Demo ob = new Demo();
	ob.var=9;
	ob.func();
}
}