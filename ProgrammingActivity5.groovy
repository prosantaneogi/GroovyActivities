package practice.groovy

class ProgrammingActivity5 {
	public static void main(def arg) {
		def givenlist = [11, 2, "Mango", 19, 5, "Apple", "Watermelon"]
		
/*		for (i in givenlist) {
			if (i.getMetaClass())== int {
				
			} 
		}*/
		def strList = givenlist.minus([11, 2, 19, 5])
		def intList = givenlist.minus(["Mango", "Apple", "Watermelon"])
		println "Sorted String list: ${strList.sort()}"
		println "Sorted Integer list: ${intList.sort()}"
	}
}
