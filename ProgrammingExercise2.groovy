package practice.groovy

class ProgrammingExercise2 {
	public static void main(def arg) {
		def grade ="F"
		def arrmarks = [20 , 30 , 50 , 70 , 99]
		def avg = arrmarks.sum()/arrmarks.size() as Integer
		println "Max number:" + arrmarks.max()
		println "Min number:" + arrmarks.min()
		println "Avg value :" + avg
		switch(avg) {
			case 90..100 :
				grade = "A"
				break
			case 80..89 :
				grade = "B"
				break
			case 70..79:
				grade ="C"
				break;
			case 50..69 :
				grade = "D"
				break;
			case 0..49:
				grade = "F"
				break;
			default:
				prinln "Invalid Number"
		}
		
		println "Print the Grade " + grade
	}
}
