package ienum;

public enum RResult{
	TALENTS,OTHERNEED,NOOFFER,REFUSE,TAKE,NONE,OVERTIME;

	@Override
	public String toString(){
		String s=null;
		switch(this){
			case TALENTS:{s="�����˲ſ�";break;}
			case OTHERNEED:{s="������������";break;}
			case NOOFFER:{s="������offer";break;}
			case REFUSE:{s="�ܾ�offer";break;}
			case TAKE:{s="����offer����ְ";break;}
			case NONE:{s="����";break;}
			case OVERTIME:{s="ȷ�ϳ�ʱ";break;}
		}
		return s;
	}

	public int toId(){
		int id=-1;
		switch(this){
			case TALENTS:{id=1;break;}
			case OTHERNEED:{id=2;break;}
			case NOOFFER:{id=3;break;}
			case REFUSE:{id=4;break;}
			case TAKE:{id=5;break;}
			case NONE:{id=6;break;}
			case OVERTIME:{id=7;break;}
		}
		return id;
	}

}