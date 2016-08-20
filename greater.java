public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int a,b,c;
System.out.println("Enter 3 numbers");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b && a>c)
System.out.println(a+" is greater"):
else if(b>c && b>a)
System.out.println(b+" is greater");
else
System.out.println(c+" is greater");
}
