package ienum;

public enum TalentsFrom{
	BF_SIFT,AFT_SIFT,AFT_I1;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case BF_SIFT:{s="δͨ��ɸѡ����";break;}
			case AFT_SIFT:{s="ͨ��ɸѡ�����";break;}
			case AFT_I1:{s="ͨ���������Ժ����";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case BF_SIFT:{id=1;break;}
			case AFT_SIFT:{id=2;break;}
			case AFT_I1:{id=3;break;}
		}
		return id;
	}

}