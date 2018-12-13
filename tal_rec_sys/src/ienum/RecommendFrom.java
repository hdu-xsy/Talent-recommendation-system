package ienum;

public enum RecommendFrom{
    STUFF,AFT_SIFT,AFT_I1;

    @Override
    public String toString(){
        String s=null;
        switch(this){
            case STUFF:{s="员工推荐";break;}
            case AFT_SIFT:{s="筛选后推荐";break;}
            case AFT_I1:{s="通过初级面试后推荐";break;}
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