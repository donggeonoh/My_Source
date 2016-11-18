package lotto_ye;

public class Lotto {
	int Nums[] = new int[6];
	int i,j,k,x;
	
	for(i=0; i<6; i++){
		x=(int)(Math.random()*45+1);
		Nums[i] = x;
		
		for(j=0; j<i; j++){
			if(Nums[i] == Nums[j]){
				x = (int)(Math.random()*45+1);
				Nums[i] = x;
				i = i-1;
			}
		}
	}
	
	for(i=0; i<6; i++){
		System.out.println("arr[i]  ");
	}
}