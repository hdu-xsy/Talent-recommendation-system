package email_template;

import ienum.Arr_result;

public class SiftEmailTemplate extends emailTemplateBase {
    private String rp_name;
    private String Arr;

    public SiftEmailTemplate(String addrto, String rp_name, Arr_result arr){
        super(addrto);
        this.rp_name=rp_name;
        switch (arr){
            case INTERVIEW:Arr="安排面试";
            case TALENTS:Arr="放入人才库";
            case OTHERNEED:Arr="安排其它需求";
        }
    }

    public void setSubject(){
        this.subject="通过筛选";
    }

    public void genContent(){
        this.content="您推荐的"+rp_name+"已经通过了筛选，积分已经奖励至你的账户。我们对被推荐人做出了"+
                Arr+"的安排决定，感谢您的推荐！";
    }
}