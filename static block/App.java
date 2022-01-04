public class App{
App()
{
System.out.println("constructor executing..... ");
}
{
System.out.println("Empty block executing.....");
}
static{
System.out.println(" static block executing.......");
}
public static void main(String []args){
new App();
}
}