import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {2,3,1,12,11,7};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void Sort(int[] a) {
		if(a.length<2)
			return;
		int middle=a.length/2;
		int[] left=new int[middle];
		int[] right=new int[a.length-middle];
		for(int i=0;i<middle;i++) {
			left[i]=a[i];
		}
		for(int i=middle;i<a.length;i++) {
			right[i-middle]=a[i];
		}
		Sort(left);
		Sort(right);
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		Merge(left, right, a);
		
	}
	public static void Merge(int left[],int right[],int[] a) {
		int i=0;int j=0;int k=0;
		while(i<left.length && j<right.length) {
		if(left[i]<=right[j]) {
			a[k]=left[i];
			k++;i++;
		}else {
			a[k]=right[j];
			k++;j++;
		}
		}
		while(j<right.length) {
			a[k]=right[j];
			k++;j++;
		}
		while(i<left.length) {
			a[k]=left[i];
			k++;i++;
		}
	}

}
