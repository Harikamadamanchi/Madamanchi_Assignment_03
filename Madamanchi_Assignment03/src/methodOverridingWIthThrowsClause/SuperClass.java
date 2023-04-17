package methodOverridingWIthThrowsClause;

public class SuperClass {
		void methodOfSuperClass()
		{
			System.out.println("Super class method is not throwing any exceptions");
		}
}

class SubClass extends SuperClass
	{
		@Override
		void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
		{
			System.out.println("can be overrided with any unchecked Exception");
		}
}

class SubClassOne extends SuperClass
	{
		@Override
		void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
		{
			System.out.println("Can be overrided with any number of Unchecked Exceptions");
		}
}

class SubClassTwo extends SuperClass
	{
		@Override
		void methodOfSuperClass() throws SQLException
		{
			//compilation error occurs as it cannot be overrided with checked Exception
		}

}


