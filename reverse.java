public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
String str,rev=" ";
int len;
System.out.println("Enter string");
str=in.nextLine();
len=str.length();
for(int i=len-1;i>=0;i--)
rev+=str.charAt(i);
System.out.println(rev);
}
