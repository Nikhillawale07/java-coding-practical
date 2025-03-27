class Student
{
	private int id;
	private String name;
	private String city;
	private double percentage;
	
	Student(int id,String name,String city,double percentage)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.percentage=percentage;	
		
	}//user defined const
	Student(){}//default const
	
	//setter method
	public void setId(int id){this.id=id;}
	public void setName(String name){this.name=name;}
	public void setCity(String city){this.city=city;}
	public void setPercentage(double percentage){this.percentage=percentage;}

	//setter method
	public int getId(){return id;}
	public String getName(){return name;}
	public String getCity(){return city;}
	public double getPercentage(){return percentage;}
	
	public String toString()
	{
		return "student[id="+id+",name="+name+",city="+city+"]";
	}
	
		
}