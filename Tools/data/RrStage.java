package ienum;

public enum RrStage{
	FINISH,OPEN,CLOSE_T,W_SIFT,W_ARR_S,W_I1,W_ARR_I1,W_I2,W_OC,W_TW;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case FINISH:{s="����";break;}
			case OPEN:{s="����";break;}
			case CLOSE_T:{s="��ʱ�ر�";break;}
			case W_SIFT:{s="�ȴ�ɸѡ";break;}
			case W_ARR_S:{s="�ȴ�����(ɸѡ��)";break;}
			case W_I1:{s="�ȴ���������";break;}
			case W_ARR_I1:{s="�ȴ�����(�������Ժ�)";break;}
			case W_I2:{s="�ȴ���������";break;}
			case W_OC:{s="�ȴ�offerȷ��";break;}
			case W_TW:{s="�ȴ���ְ";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case FINISH:{id=1;break;}
			case OPEN:{id=2;break;}
			case CLOSE_T:{id=3;break;}
			case W_SIFT:{id=4;break;}
			case W_ARR_S:{id=5;break;}
			case W_I1:{id=6;break;}
			case W_ARR_I1:{id=7;break;}
			case W_I2:{id=8;break;}
			case W_OC:{id=9;break;}
			case W_TW:{id=10;break;}
		}
		return id;
	}

}