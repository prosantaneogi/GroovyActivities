package practice.groovy

class ProgrammingExercise4 {
	static void main(def arg) {
		
		def givenstr = "This is a Groovy Language"
		
		println "The reverse of $givenstr is :" + givenstr.reverse()
		
		println "The substring of $givenstr is :" + givenstr.substring(10)
		
		println "Split the string into separate words $givenstr is :" + givenstr.split(" ")
		
		println "Remove words from the given string $givenstr : This is a  Language  :" + givenstr.replace("This is a", "").replace("Language", "")
		
		println "The lowercase of $givenstr is :" + givenstr.toLowerCase()
		
		println "The uppercase of $givenstr is :" + givenstr.toUpperCase()
		
	}
}
