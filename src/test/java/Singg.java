
public class Singg {
 private static Singg s=null;
 private String str;
 private Singg() {
	 str="hello";
 }
 public static Singg getinstance() {
	 if(s==null) 
		 s=new Singg();
	 
	return s;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singg d=Singg.getinstance();
		
		System.out.println(d.str.toLowerCase());
	}

}
