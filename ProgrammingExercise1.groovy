package practice.groovy

import java.security.PublicKey

class ProgrammingExercise1  {
	public static void main (def arg) {
		def x
		int y
		
		def arr1 = [1, 5.0 , "Groovy Practice" , true , x, y]
		arr1.each { println "arr1: "+it}
		arr1.each { println "arr1 type : "+it.getClass()}
	}

	}
