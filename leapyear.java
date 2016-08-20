public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int a;
System.out.println("Enter year");
a=in.nextInt();
if(a%4==0 || a%400==0 && a%100!=0)
System.out.println(a+" is leap year");
else
System.out.println(a+" is not leap year");
}
