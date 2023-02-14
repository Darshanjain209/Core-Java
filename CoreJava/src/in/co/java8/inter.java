package in.co.java8;
@FunctionalInterface
public interface inter {
	
	public int add(int a,int b);
	
	public default void defmethod()
	{
		System.out.println("im default method");
	}
	public default void Static()
	{
		System.out.println("im static method");
	}
	
}
