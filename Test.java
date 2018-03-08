
public class Test {

	public static void main(String[] args) {
		
		System.out.println("Output A:");
		Dog d = new Dog();
		System.out.println(d.call(3));
		System.out.println("###################");
		System.out.println(" Output B:");
		Object c = new Cat();
		System.out.println(c);
		System.out.println("###################");
		System.out.println(" Output  C:   Wrong way object called");
		
		//Object v = new pet();
		//System.out.println(v.call());
		System.out.println("###################");
		System.out.println("Output  D:");
		pet p = new pet();
		System.out.println(p);
		System.out.println("###################");
		System.out.println("Output E:");
		pet q = new Dog();
		System.out.println(q.call());
		System.out.println("###################");
		System.out.println("Output F:");
		Cat t = new Cat();
		System.out.println(t.toString("Come here, kitty"));
		System.out.println("###################");
		System.out.println("Output  G:  Wrong way object called");
		//Cat u = new Cat();
		//System.out.println(u.call(3));
		
		System.out.println("###################");
		System.out.println("Output  H:");
		Dog e = new Dog();
		System.out.println(e.feet());
		System.out.println("###################");
		System.out.println("Output I:Wrong way object called");
		//pet r = new Dog();
		//System.out.println(r.call(3));
			    
			    
	}

}
