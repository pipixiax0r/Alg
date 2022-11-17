import javax.xml.transform.Templates;

class Example{
	public static void sort(Comparable[] a){}

	protected static boolean less(Comparable a, Comparable b){
		return a.compareTo(b) < 0;
	}

	protected static void exch(Comparable[] a, int i, int j){
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void show(Comparable[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
			System.out.print(' ');
		}
	}

	public static boolean isSorted(Comparable[] a){
		for(int i=0; i<a.length-1; i++){
			if(less(a[i+1], a[i])){
				return false;
			}
		}
		return true;
	}
}

class Selection extends Example{
	public static void sort(Comparable[] a){
		for(int i=0; i < a.length; i++){
			int min = i;
			for (int j=i; j<a.length; j++){
				if(less(a[j], a[min])){
					min = j;
				}
			}
			exch(a, i, min);
		}
	}
}

class Insertion extends Example{
	public static void sort(Comparable[] a){
		for(int i=1; i<a.length; i++){
			for(int j=0; j<i; j++){
				if(less(a[i], a[j])){
					Comparable temp = a[i];
					for(int k=i; k>=j; k--){
						a[k] = a[k-1];
					}
					a[j] = temp;
				}
			}
		}
	}
}

public class Sort{
	public static void main(String[] args) {
		String[] a = {"a", "d", "b", "c", "z", "f", "a"};
		Insertion.sort(a);
		Insertion.show(a);
		System.out.println(Insertion.isSorted(a));
	}
}