package org.jacoco.examples.maven.java;

public class HelloWorld {

	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

    public static void main(String[] args){
        //HelloWorld x = new HelloWorld();
        System.out.println("HELLO");
    }

}
