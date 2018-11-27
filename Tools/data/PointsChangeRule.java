package ienum;

public enum PointsChangeRule{
	PASS_SIFT,PASS_I1,PASS_I2,TW;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case PASS_SIFT:{s="ͨ��ɸѡ�ӷ�";break;}
			case PASS_I1:{s="ͨ���������Եȴ�����";break;}
			case PASS_I2:{s="ͨ������";break;}
			case TW:{s="��ְ";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case PASS_SIFT:{id=1;break;}
			case PASS_I1:{id=2;break;}
			case PASS_I2:{id=3;break;}
			case TW:{id=4;break;}
		}
		return id;
	}

}