// 653380024-8 วิชชากร บุญประคม sec 2
public class Order {
    private int oderNo;
    private double amount;
    private String note;
    private double Vat;
    private double Total;
    private static int runningNo = 0;
    private static double vatRate = 0.07;
    public Order(){
        this.oderNo = Order.getRunningNo();
        this.amount = 0;
        this.note = "";
    }
    public Order(double amount,String Note){
        this.oderNo = Order.getRunningNo();
        this.amount = amount;
        this.note = Note;
    }

    private static int getRunningNo() {
        runningNo ++;
        return runningNo;
    }

    public int getOrderNo() {
        return this.oderNo;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getVat() {
        this.Vat = this.amount*vatRate;
        return this.Vat;
    }

    public double getTotal() {
        this.Total = this.amount + this.Vat;
        return Total;
    }

    public String getNote() {
        return note;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static void setVatRate(double newRate) {
        Order.vatRate = newRate/100;
    }
}
