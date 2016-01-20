import java.lang.reflect.Array;

public class Max {
	
	public static void main(String[] args) {
		int [] cards = {6, 7, 2, 5, 2, 3, 9};
		System.out.println("Max:" + max(cards));
		System.out.println("Sorted:" );
		int[] sorted = ascending(cards);
		for (int x : sorted) {
			System.out.print(x + ", ");
		}
	}
	public static int max(int[] array) {
		int Max = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (Max < array[i]) {
				Max = array[i];
			}
		}
		return Max;
	}
	public static int[] ascending(int[] cards) {
		int store = 0;
		for (int n = 0; n < cards.length -1; n++) {
			for (int i = 0; i < cards.length - 1; i++) {
				if (cards[i] > cards[i+1]){
					store = cards[i];
					cards[i] = cards[i+1];
					cards[i+1] = store;
				}
			}
		}
		return cards;
	}
	public static int[] selection(int[] cards) {
		for (int i = 0; i < cards.length - 1; i++) {
			for (int n = 0; i < cards.length - 1; n++){
				int min = 0;
				if (min > cards[n]) {
					min = cards[n];
					
				}
			}
		}
	}
	public static void selectionsort (int[] a) {
		for (int i=0; i<a.length; i++) {
			int minIndex = i;
			for (int j=i+1; j<a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex =j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
	public static void yesOrno (int num) {
		for (int i = 0; i < a.length; i++) {
			
		}
	}
}