public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int a,fact=1;
System.out.println("Enter number");
a=in.nextInt();
for(int i=1;i<=a;i++)
fact*=i;
System.out.println(fact);
}
