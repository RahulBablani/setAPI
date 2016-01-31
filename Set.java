
/*Student Information
 * -------------------	
 * Student Name: Bablani, Rahul
 * Student Number: 001418434
 * Course Code:	CS/SE 2XB3	
 * Lab Section: 03
 * 	
 * I attest	that the following code	being submitted	is my own individual
 * work.
*/
import java.util.*;

public class Set {

	private ArrayList<String> fString = new ArrayList<String>();
	private char[] isEqual;

	public Set(ArrayList<String> passedArrayToOurClass) {
		fString = passedArrayToOurClass;
	}

	public ArrayList<String> getArray() {
		return fString;
	}

	public ArrayList<String> Union(Set haystack) {

		ArrayList<String> fStringNoDup = noDuplications(fString);
		ArrayList<String> haystackNoDup = noDuplications(haystack.getArray());

		ArrayList<String> finalArrayList = new ArrayList<String>();

		for (int i = 0; i < fStringNoDup.size(); i++) {
			if (haystackNoDup.contains(fStringNoDup.get(i)) == false) {
				finalArrayList.add(fStringNoDup.get(i));
			}
		}

		for (int i = 0; i < haystackNoDup.size(); i++) {
			if (fStringNoDup.contains(haystackNoDup.get(i)) == false) {
				finalArrayList.add(haystackNoDup.get(i));
			}
		}

		return finalArrayList;
	}

	public ArrayList<String> noDuplications(ArrayList<String> haystack) {
		ArrayList<String> temp = new ArrayList<String>();

		for (int i = 0; i < haystack.size(); i++) {
			if (temp.contains(haystack.get(i)) == false) {
				temp.add(haystack.get(i));
			}
		}

		return temp;

	}

	public ArrayList<String> Intersect(Set input) {

		ArrayList<String> fStringNoDup = noDuplications(fString);
		ArrayList<String> haystackNoDup = noDuplications(input.getArray());

		ArrayList<String> finalArrayList = new ArrayList<String>();

		for (int i = 0; i < fStringNoDup.size(); i++) {
			if (haystackNoDup.contains(fStringNoDup.get(i)) == true) {
				finalArrayList.add(fStringNoDup.get(i));
			}
		}
		return finalArrayList;
	}

	public ArrayList<String> noDuplication(ArrayList<String> input) {
		ArrayList<String> temp = new ArrayList<String>();

		for (int i = 0; i < input.size(); i++) {
			if (temp.contains(input.get(i)) == false) {
				temp.add(input.get(i));
			}
		}
		return fString;
	}

	public ArrayList<String> Difference(Set input) {

		ArrayList<String> fStringNoDup = noDuplications(fString);
		ArrayList<String> haystackNoDup = noDuplications(input.getArray());

		ArrayList<String> finalArrayList = new ArrayList<String>();

		for (int i = 0; i < fStringNoDup.size(); i++) {
			if (haystackNoDup.contains(fStringNoDup.get(i)) == false) {
				finalArrayList.add(fStringNoDup.get(i));
			}
		}
		return finalArrayList;
	}

	public ArrayList<String> noDuplication1(ArrayList<String> input) {
		ArrayList<String> temp = new ArrayList<String>();

		for (int i = 0; i < input.size(); i++) {
			if (temp.contains(input.get(i)) == false) {
				temp.add(input.get(i));
			}
		}
		return fString;
		
	}
	public ArrayList<String> Product(Set input) {
		
		ArrayList<String> fStringNoDup = noDuplications(fString);
		ArrayList<String> InputNoDup = noDuplications(input.getArray());
		
		ArrayList<String> finalArrayList = new ArrayList<String>();
		
		for (int i = 0; i < fStringNoDup.size(); i++) {
			for (int j = 0; j < InputNoDup.size(); j++) {
				finalArrayList.add("("+ fStringNoDup.get(i)+ "," +InputNoDup.get(j)+")");
			}
		}
		
		return finalArrayList;
	}
		public boolean isEqual(Set input) {
			
			ArrayList<String> set1 = noDuplications(fString);
			ArrayList<String> set2 = noDuplications(input.getArray());
			
			if (set2.containsAll(set1)){
				return true;
			} else {
				return false;
			}
	}
		
		public boolean isSubset(Set input) {
			ArrayList<String> fStringNoDup = noDuplications(fString);
			ArrayList<String> InputNoDup = noDuplications(input.getArray());
			
			if(InputNoDup.size() == 0){
				return true;
			}
			for(int i = 0; i < InputNoDup.size(); i++){
				if (InputNoDup.contains(fStringNoDup)) {
				}else{
					return false;
					}
				}
			return true;
			}
		
		public int getCount(Set input) {
			ArrayList<String> InputNoDup = noDuplications(input.getArray());
			return InputNoDup.size();
			}
		
		public ArrayList<String> getCardinality(Set input) {
			boolean check = true;
			int count = 0;
			ArrayList<String> fStringNoDup = noDuplications(fString);
			ArrayList<String> InputNoDup = noDuplications(input.getArray());
			ArrayList<String> finalArrayList = new ArrayList<String>();
			
			for(int i=0;i<InputNoDup.size();i++){
				for(int j=i+1; j < InputNoDup.size(); j++){
					if(InputNoDup.get(i) == InputNoDup.get(j)) {
						check = false;
					}
				}
			for(int j=0; j<i; j++){
				System.out.println(InputNoDup.get(i)+ " " + InputNoDup.get(j));
				if(InputNoDup.get(i) == InputNoDup.get(j)) {
					check = false;
				}
			}
			if(check){
				count++;
			}
			return finalArrayList;
		}	
		
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("Rahul", "on", "Rails", "Nabili", "Doomy", "Illi",
				"ChubTash", "Dr.Reza", "Areeb", "Aaska"));
		ArrayList<String> s2 = new ArrayList<String>(
				Arrays.asList("Rahul", "on", "Rails", "MIA", "LOL", "Doomy", "Random", "Test", "SQAAA", "JEEZ"));

		Set inputArray = new Set(s1);
		Set inputTwo = new Set(s2);

		for (int i = 0; i < inputArray.Union(inputTwo).size(); i++) {
			System.out.println(inputArray.Union(inputTwo).get(i));
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < inputArray.Intersect(inputTwo).size(); i++) {
			System.out.println(inputArray.Intersect(inputTwo).get(i));
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < inputArray.Difference(inputTwo).size(); i++) {
			System.out.println(inputArray.Difference(inputTwo).get(i));
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < inputArray.Product(inputTwo).size(); i++) {
			System.out.println(inputArray.Product(inputTwo).get(i));
		}
		System.out.println("-----------------------------------");
		System.out.println(inputArray.isEqual(inputTwo));
		
		System.out.println("-----------------------------------");
		System.out.println(inputArray.isSubset(inputTwo));
		
		System.out.println("-----------------------------------");
		System.out.println(inputArray.getCount(inputTwo));
		}
	}

