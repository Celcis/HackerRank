package baykara.com;

public class Rotations {


	public int[] rotateLeft(int[] a, int n) {
		
		int[] a2 = new int[a.length];
		int index =0;
		int k=0;
		int d=n;
		//n is minus then to rotateRight
		if(d < 0) d = a.length+d;
		
		for (int i = 0; i < a.length; i++) 
		{
			 
		  {
			if (d < a.length) 
			{
				a2[index++]= a[d++];
			}else 
			{
				a2[index++]= a[k++];
				
			}
		  }
			
		}
		
		for (int i = 0; i < a2.length; i++) {
			a[i]=a2[i];
		}
		
		return a;
		
		
		
	}
public static void main(String[] args) {
		
		Rotations r = new Rotations();
		int[] a = new int[] {1,2,3,4,5};
		r.rotateLeft(a, -1);
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}
}
