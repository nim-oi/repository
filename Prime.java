/*100ˆÈ‰º‚Ì‘f”‚ğ”­Œ©‚·‚é*/
class Prime{
	final static int maxRoot=10;
	final static int max=maxRoot*maxRoot;
	final static int[] prim={2,3,5,7,11};//maxRootˆÈã‚ÅÅ¬‚Ì‘f”‚ğÅ‘å‚Æ‚·‚é‘f”‚Ì—ñ
	final static int pSize=5;//prim‚Ì—v‘f”
	final static int pMax=11;
	
	public static void main(String[] args){
		//n‘f”‚È‚çnumPrim[n-1]‚Étrue‚ğŠi”[‚µ‚Ä‚¢‚­
		boolean[] numPrim=new boolean[max];
		
		//prim[]‚Ì—v‘f‚ÉŒÂ•Ê‚Åtrue‚ğ“ü‚ê‚é
		for(int i=0;i<pSize;i++){
			
			numPrim[prim[i]-1]=true;
		}
		
		//pMaxˆÈã‚ÅcheckPrim‚ªtrue‚È‚çtrue
		for(int i=pMax+1;i<max;i++){
			numPrim[i]=checkPrim(i+1);
		}
		
		//•\¦
		System.out.print(max+"ˆÈ‰º‚Ì‘f”‚Í");
		for(int i=0;i<max;i++){
			if(numPrim[i]){
				System.out.print(","+(i+1));
			}
		}
		System.out.println("‚Å‚·B");
	}
	
	//Prim‚ÅŠ„‚èØ‚ê‚½‚çfalseB‚¶‚á‚È‚©‚Á‚½‚çTrue
	static boolean checkPrim(int n){
		for(int i=0;i<pSize;i++){
			if(n%prim[i]==0)return false;
		}
		return true;
	}
}