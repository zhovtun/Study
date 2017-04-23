import java.util.Arrays;
import java.lang.String;

public class MyArray
{
	private String[] arr1; 
	private String[] arr2;
	private String[] arr3;
	 
	 MyArray () {
		 arr1 = new String[] {"a", "c", "e", "k", "o", "x", "y", "z"};
		 arr2 = new String[] {"a", "b", "d", "f", "h", "i", "k", "m", "o", "q", "w"};
		 arr3 = new String[arr1.length+arr2.length];
	 } 
	 
	 public String printArray (String[] arr) {
		 int i=0;
		 String result = "{ ";
		 while (i < arr.length && arr[i] != null) {
			 result += arr[i] + " ";
			 i++;
		 }
		 result += "}";
		 return result;
	 }
	 
	 
	 public void sort() {
		 //TODO сортировка
	 }
	 
	 
	 public String aIsSubsetB () {  //а является подмножеством в
	     int i=0, j=0;
		 String result;
		 
		 while (i!=arr1.length && j!= arr2.length) {
			 if (arr1[i] == arr2[j]) {
				 i++;
				 j++;
			 }
			 else {
				 j++;
			 }
		 }
		 if (i == arr1.length) {
			 return result = "Множество А является подмножеством В";
		 }
		 else {
			 return result = "Множество А не является подмножеством В";
		 }
     }
	 
	 
	public String sum () {  //объединение множеств
	    int i=0, j=0, k=0;
		String result = " ";
		
		
		if (aIsSubsetB() == "Множество А является подмножеством В") {
			result = "Результат объединения - множество С = " + printArray(arr2);
			}
		else {
			while (i!=arr1.length && j!= arr2.length) {
				if (arr1[i].compareTo(arr2[j]) == 0) {
				    arr3[k] = arr1[i];
				    i++; 
				    j++;
				    k++;
				}
				else if (arr1[i].compareTo(arr2[j]) > 0) {
					arr3[k] = arr2[j];
					j++;
					k++;
				}
				else {
					arr3[k] = arr1[i];
					i++;
					k++;
				}
			}
			result = "Результат объединения - множество С = " + printArray(arr3);
		}
		
		return result;
	}
	
	
	public String intersection () {  //умножение (пересечение) множеств
		int i=0, j=0, k=0;
		String result = " ";
		
	    while (i!=arr1.length && j!= arr2.length) {
			if (arr1[i].compareTo(arr2[j]) == 0) {
				arr3[k] = arr1[i];
				i++; 
				j++;
				k++;
			}
			else if (arr1[i].compareTo(arr2[j]) > 0) {
				j++;
			}
			else {
				i++;
			}
		}
	    if (k == 0) {result = "Множества не пересакаются";}
		else {result = "Результат пересечения - множество С = " + printArray(arr3);}	
		return result;
	}
	
	
	public String diff () {  //разность множеств
		int i=0, j=0, k=0;
		String result = " ";

	    while (i!=arr1.length && j!= arr2.length) {
			if (arr1[i].compareTo(arr2[j]) == 0) {
				i++; 
				j++;
			}
			else if (arr1[i].compareTo(arr2[j]) > 0) {
				
				j++;
			}
			else {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
		}
		while (i<arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		if (k == 0) {result = "Множества не вычитаются";}
		else {result = "Результат разности - множество С = " + printArray(arr3);}	
		return result;
	}
	
	
	public String simmetricDiff () {  //симметрическая разность
		int i=0, j=0, k=0;
		String result = " ";

	    while (i!=arr1.length && j!= arr2.length) {
			if (arr1[i].compareTo(arr2[j]) == 0) {
				i++; 
				j++;
			}
			else if (arr1[i].compareTo(arr2[j]) > 0) {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
			else {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
		}
		while (i<arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		if (k == 0) {result = "Множества не вычитаются";}
		else {result = "Результат симметрической разности - множество С = " + printArray(arr3);}	
		return result;
	}
	
	
}
