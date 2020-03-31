public class person {
	String firstname;
	String lastname;
	int age;
	public String getfirstname() {
		return firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public int getage() {
		return age;
	}
	public void setfirstname(String fn) {
		firstname = fn;
	}
	public void setlastname(String ln) {
		lastname = ln;
	}
	public void setage(int a) {
	if(a<0 || a>100)
		age=0;
	else
		age = a;
	}
	public void teen() {
		if(age >=12 && age<20) {
			System.out.println("is a teen if age in between 12-19");
		}
		else {
			System.out.println("is not a teen");
		}
			
	}



}
