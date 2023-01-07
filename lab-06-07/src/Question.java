// 653380024-8 sec2 วิชชากร บุญประคม
import java.util.ArrayList;

public class Question {
    private int questionNo;
    private String questionDetail;
    private int point;
    private ArrayList<Choice> ChoiceList;

    public Question(int questionNo, String questionDetail, int point) {
        this.questionNo = questionNo;
        this.questionDetail = questionDetail;
        this.point = point;
        ChoiceList = new ArrayList<>();
    }

    public Question() {
        questionNo = 0;
        questionDetail = "";
        point = 0;
        ChoiceList = new ArrayList<>();
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    public String getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(String questionDetail) {
        this.questionDetail = questionDetail;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public ArrayList<Choice> getChoiceList() {
        return ChoiceList;
    }

    public void addChoice(Boolean answer,String questionDetail){
        this.ChoiceList.add(new Choice(answer,questionDetail));
    }
    public void Show(){
        for (Choice c: ChoiceList) {
            System.out.println("Choice "+c.getDetail());
            System.out.println("Answer "+c.getAnswer());
        }
    }
}
