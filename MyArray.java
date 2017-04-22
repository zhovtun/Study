public class MyArray
{
	private String[] arr1; 
	private String[] arr2;
	private String[] arr3;
	 
	 MyArray () {
		 arr1 = new String[] {"a", "b", "d", "f", "h", "i", "k", "m", "o", "q", "w"};
		 arr2 = new String[] {"a", "d", "i", "j", "k", "p", "q"};
		 arr3 = new String[arr1.length+arr2.length];
	 } 
	 
	 public void show () {
		 System.out.println(arr1.length + " " + arr2.length + " " + arr3.length);
	 }
	 
	 
	 public void sort() {
		 //TODO сортировка
	 }
	 
	 public String aIsSubsetB () {  //а является подмножеством в
		 String result = " ";
		 //TODO вычисление операции
		 
		 return result;
     }
	 
	public String sum () {  //объединение множеств
		String result = " ";
		//TODO вычисление операции

		return result;
	}
	
	public String intersection () {  //умножение множеств
		String result = " ";
		//TODO вычисление операции

		return result;
	}
	
	public String diff () {  //разность множеств
		String result = " ";
		//TODO вычисление операции

		return result;
	}
	
	public String simmetricDiff () {  //симметрическая разность
		String result = " ";
		//TODO вычисление операции

		return result;
	}
	
	
}
