class MainClass
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("ABC");
		s1.setCity("pune");
		s1.setPercentage(81.12);
		System.out.println("ID:"+s1.getId());
		System.out.println("Name:"+s1.getName());
		System.out.println("City:"+s1.getCity());
		System.out.println("Percentage:"+s1.getPercentage());
		
		Student s2 = new Student(18,"DEF","Delhi",82.12);
		System.out.println(s2);
	}
}