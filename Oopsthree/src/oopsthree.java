
public class oopsthree {

	public static void main(String[] args) {
		person fullname = new person();
		fullname.setfirstname("DURGA JASWANTH");
		fullname.setlastname("MUSUNURI");
		fullname.setage(24);
		System.out.println(fullname.getfirstname());
		System.out.println(fullname.getlastname());
		System.out.println("He is " + fullname.getage() + " years old");
		fullname.teen();
		
		
		


	}

}
