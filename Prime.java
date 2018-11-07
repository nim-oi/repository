/*100�ȉ��̑f���𔭌�����*/
class Prime{
	final static int maxRoot=10;
	final static int max=maxRoot*maxRoot;
	final static int[] prim={2,3,5,7,11};//maxRoot�ȏ�ōŏ��̑f�����ő�Ƃ���f���̗�
	final static int pSize=5;//prim�̗v�f��
	final static int pMax=11;
	
	public static void main(String[] args){
		//n�f���Ȃ�numPrim[n-1]��true���i�[���Ă���
		boolean[] numPrim=new boolean[max];
		
		//prim[]�̗v�f�Ɍʂ�true������
		for(int i=0;i<pSize;i++){
			
			numPrim[prim[i]-1]=true;
		}
		
		//pMax�ȏ��checkPrim��true�Ȃ�true
		for(int i=pMax+1;i<max;i++){
			numPrim[i]=checkPrim(i+1);
		}
		
		//�\��
		System.out.print(max+"�ȉ��̑f����");
		for(int i=0;i<max;i++){
			if(numPrim[i]){
				System.out.print(","+(i+1));
			}
		}
		System.out.println("�ł��B");
	}
	
	//Prim�Ŋ���؂ꂽ��false�B����Ȃ�������True
	static boolean checkPrim(int n){
		for(int i=0;i<pSize;i++){
			if(n%prim[i]==0)return false;
		}
		return true;
	}
}