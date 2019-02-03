package dividedfrom1to20;

public class Smallest {
	public static int a(int i,int k) {
		if(i<=1) {
			return k%i;
		}
		else {
			return k%i+a(i-1,k);
		}
	}
	public static void main(String[] args) {
		int i =20;
		int j =1;
		boolean a = true;
		while(a=true) {
			if(a(i,j)==0) {
				System.out.println(j);
				break;
			}else {
				j++;
			}
			
			
		}
	}
}
