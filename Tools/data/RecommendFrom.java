package ienum;

public enum RecommendFrom{
	STUFF,AFT_SIFT,AFT_I1;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case STUFF:{s="Ա���Ƽ�";break;}
			case AFT_SIFT:{s="ɸѡ���Ƽ�";break;}
			case AFT_I1:{s="ͨ���������Ժ��Ƽ�";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case STUFF:{id=1;break;}
			case AFT_SIFT:{id=2;break;}
			case AFT_I1:{id=3;break;}
		}
		return id;
	}

}