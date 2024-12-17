package com.example.demo.singleton;

class Singleton{
		
	//Eager Instantiation
		private static Singleton single_instance = null;
		
		public String s;
		
		private Singleton() {
			s= "Hello I am a string part of Singleton class";
		}
		
		//method
		public static synchronized Singleton getInstance() {
			if (single_instance == null) {
				single_instance = new Singleton();
			}
			return single_instance;
		}
		
}	

public  class SingletonDemo{

	public static void main(String[] args) {
		// Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
 
        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
 
        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
 
        // Printing the hash code for above variable as declared
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
        
        // Condition check
        if (x == y && y == z) {
        	System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }
 
        else {
        	System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
        System.out.println();
        
        x.s = (x.s).toUpperCase();
        
        // Print and display commands
        System.out.println();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        // Now again changing variable of instance z
        z.s = (z.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    

	}

}
