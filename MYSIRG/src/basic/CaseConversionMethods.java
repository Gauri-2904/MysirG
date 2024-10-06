package basic;

public class CaseConversionMethods {

	public static void main(String[] args) {
		String s1=new String("Gauri") ;
		String s4=new String("Gauri") ;
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3= s2.toLowerCase();
		System.out.println(s3);
		
		int i=s1.indexOf('u');
		System.out.println("index:"+i);
		 i=s1.indexOf('p',3);//indexOf(int ch,int fromIndex)
		System.out.println("index:"+i);
		// means char is not present from which we are searching
	    	i= s1.indexOf("uri");
	    System.out.println("index:"+i);
	    
	   
//	    	comparing 2 strings 
//	    	equals()
//	    	equalsIgnoreCae(String another String)
//	    	comparTo(Strings)
	    if(s1.equals(s4))
	    	 System.out.println("strings are same");
	    else {
	    	 System.out.println("not same");
	    	 String s5="gauri";
	    	 if	(s2.equalsIgnoreCase(s5))
	    		 System.out.println("strings are same");
	 	    else {
	 	    	 System.out.println("not same");
	 	    	 String s6="Hello";
	 	    	  i=s1.compareTo(s6);
	 	    	  if(i==0)
	 	    		 System.out.println("not same");
	 	    	  else if(i>0)
	 	    		 System.out.println("not opposite to dictionary order");
	 	    	  else
	 	    		 System.out.println("Dictionary order");
	 	  
	    
	 	    	 
	    }
	}
	
	}
	}


