import java.util.Arrays;

public class Sorting2 {

	public static void main(String[] args) {
		int x[]= {1,2,4,6,7,8};
		int y=Sort(x,6);
		System.out.println(y);
		
		
	}
	
	public static int Sort(int x[],int target) {
		
		int t=7;
		int left=0;int right=x.length-1;int middle;
		while(left<=right) {
			middle=(left+right)/2;
			if(x[middle]==t) {
				return middle;
			}
			if(x[middle]>t) {
				right=middle-1;
			}else {
				left=middle+1;
			}
		}
		return -1;
		
	}
	public static void Merge(int left[],int right[],int a[]) {
		
		
	}

}
