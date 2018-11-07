/*100以下の素数を発見する*//*test*/
class Prime{
	final static int maxRoot=10;
	final static int max=maxRoot*maxRoot;
	final static int[] prim={2,3,5,7,11};//maxRoot以上で最小の素数を最大とする素数の列
	final static int pSize=5;//primの要素数
	final static int pMax=11;
	
	public static void main(String[] args){
		//n素数ならnumPrim[n-1]にtrueを格納していく
		boolean[] numPrim=new boolean[max];
		
		//prim[]の要素に個別でtrueを入れる
		for(int i=0;i<pSize;i++){
			
			numPrim[prim[i]-1]=true;
		}
		
		//pMax以上でcheckPrimがtrueならtrue
		for(int i=pMax+1;i<max;i++){
			numPrim[i]=checkPrim(i+1);
		}
		
		//表示
		System.out.print(max+"以下の素数は");
		for(int i=0;i<max;i++){
			if(numPrim[i]){
				System.out.print(","+(i+1));
			}
		}
		System.out.println("です。");
	}
	
	//Primで割り切れたらfalse。じゃなかったらTrue
	static boolean checkPrim(int n){
		for(int i=0;i<pSize;i++){
			if(n%prim[i]==0)return false;
		}
		return true;
	}
}
