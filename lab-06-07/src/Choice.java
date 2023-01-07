// 653380024-8 sec2 วิชชากร บุญประคม
public class Choice {
    private Boolean answer;
    private String detail;

    public Choice(){
        this.answer = Boolean.FALSE;
        this.detail = "";
    }
    public Choice(Boolean answer ,String detail){
        this.answer = answer;
        this.detail = detail;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
