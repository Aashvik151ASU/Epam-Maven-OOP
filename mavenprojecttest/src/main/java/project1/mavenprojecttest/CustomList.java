package project1.mavenprojecttest;
import java.util.Arrays;
public class CustomList<L> {

	public Object obj[]=new Object[10];
	
	public int l=0;
	
	public int s=10;
	
	public CustomList()
	{
		for(int i=0;i<10;i++)
			obj[l++]=String.valueOf(i+1);
	}
	
	
	public void add(L data)
	{
	
		if(l>=s)
		
		{
		
			memoryAllocate();
		
		}
		obj[l++]=String.valueOf(data);
	}
	private void memoryAllocate() 
	{
	       int newSize = (obj.length*3)/2+1;
	       s=newSize;
	       obj = Arrays.copyOf(obj, newSize);
	}
	
	public Object get(int index) 
	{
		if(index>=0 && index<l)
			return obj[index];
		return null;
	}
	
	public int remove(int index)
	{
		if(index>=0 && index<l)
		{
			int del = l - ( index + 1 ) ;
		    System.arraycopy(obj, index + 1,obj,index,del) ;
		    l-=1;
		    return 1;
		}		
		return 0;
	}
	
	public int size() 
	{
		return l;
	}
}
