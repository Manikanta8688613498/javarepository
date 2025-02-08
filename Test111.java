class Game{
String name="mario";
public void play(){
System.out.println("Playing..");
}
}
public class Test1111
{
public static void main(String[] args) throws Exception
{
Class c= Class.forName("Game");
Object o=c.newInstance();
Game g=(Game)o;
System.out.println(g);
System.out.println(g.name);
g.play();
}
}