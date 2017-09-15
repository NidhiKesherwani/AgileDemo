
public class Maths {
	
	public int getFact(int num)
	{
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		
		if(num==0||num==1)
		{
			return 1;
		}
		if(num>1)
		{
			while(num>0)
			{
			int f = num*getFact(num-1);
			return f;
			}
		}
		return num;
	}

}




