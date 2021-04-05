package dynamicProxy;

import java.util.ArrayList;
import java.util.List;

public class Log {
	
	public static List<String> list = new ArrayList<String>();
	public static int count;
	public static void addLog(String name)
	{
		list.add(name);
		count++;
	}
	public static List<String> getList() {
		return list;
	}
	
	public static int getCount() {
		return count;
	}
	
	

}
