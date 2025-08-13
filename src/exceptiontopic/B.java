package exceptiontopic;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Method Overrdding With Exception:-
------------------------------------

1. if the superclass method does not declare an exception
-----------------------------------------------------------
	subclass overridden method cannot declare the checked exception 
but it can declare unchecked exception.


2. If the superclass method declares an exception
---------------------------------------------------
	===> subclass overridden method can declare same, 
	===> subclass exception or 
	===> no exception 
	===> but cannot declare parent exception.

*/
public class B extends A
{
	@Override
	public void test1() 
	{
		
	}
}
















