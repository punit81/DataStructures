
public class ArrayRotation {
	static int[] rotate(int[]arr,int n,int d) {
		int temp,gc,i,j,k;
		if(d>n) {
			d=d%n;
		}
		gc=gcd(n,d); 	
		for(i=0;i<gc;i++) {
			j=i;
			temp=arr[i];
			while(true) {
				k=j+d;
				if(k>=n) {
					k=k-n;
				}
				if(k==i) {
					break;
				}
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
			}
		return arr;
	}
	static int gcd(int n,int d) {
		if(d==0) {
			return n;
		}
		return gcd(d,n%d);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12},n=12,d=3;
		
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+",");
		}
		System.out.println("]");
		arr=rotate(arr,n,d);
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}

}
