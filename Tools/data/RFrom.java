package ienum;

public enum RFrom{
	FROM_STU,AFT_SIFT,AFT_I1;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case FROM_STU:{s="Ա���Ƽ�";break;}
			case AFT_SIFT:{s="ɸѡ���Ƽ�";break;}
			case AFT_I1:{s="ͨ���������Ժ��Ƽ�";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case FROM_STU:{id=1;break;}
			case AFT_SIFT:{id=2;break;}
			case AFT_I1:{id=3;break;}
		}
		return id;
	}

}