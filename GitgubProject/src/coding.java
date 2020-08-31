
public class coding {
	 public static int Reverse(int num, int len)
	    {
	       if(len==0)
	       return 0;
	       return (int) (((num%10)*Math.pow(10, len-1))+Reverse(num/10, --len));
	    }
		public static void main (String[] args) throws java.lang.Exception
		{
		    int length=0;
			int num=1264;
			int temp=num;
			while(temp!=0)
			{
			    length++;
			    temp=temp/10;
			}
			System.out.print(Reverse(num, length));
		}
}
