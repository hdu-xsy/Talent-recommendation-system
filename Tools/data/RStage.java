package ienum;

public enum RStage{
	FINISH,W_SIFT,W_I1,W_I2,W_OC,W_TW,W_ARR_S,W_ARR_I1;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case FINISH:{s="����";break;}
			case W_SIFT:{s="�ȴ�ɸѡ";break;}
			case W_I1:{s="�ȴ���������";break;}
			case W_I2:{s="�ȴ���������";break;}
			case W_OC:{s="�ȴ�offerȷ��";break;}
			case W_TW:{s="�ȴ���ְ";break;}
			case W_ARR_S:{s="�ȴ�����(ɸѡ��)";break;}
			case W_ARR_I1:{s="�ȴ�����(�������Ժ�)";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case FINISH:{id=1;break;}
			case W_SIFT:{id=2;break;}
			case W_I1:{id=3;break;}
			case W_I2:{id=4;break;}
			case W_OC:{id=5;break;}
			case W_TW:{id=6;break;}
			case W_ARR_S:{id=7;break;}
			case W_ARR_I1:{id=8;break;}
		}
		return id;
	}

}