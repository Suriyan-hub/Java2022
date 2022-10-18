class Local
{
void name()
{
int a=10; float b=2.5f; char c='a';
double d=14.33333; String e="Hello"; System.out.println(a); System.out.println(b); System.out.println(c); System.out.println(d); System.out.println(e);
}
void sum()
{
System.out.println("java is simple");
}
public static void main(String[]args)
{
Local out=new Local(); out.name();
out.sum();
}
}
