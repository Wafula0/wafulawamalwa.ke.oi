public class BankAccount {
    public String name;
    public int account_no;
    private int id_no;

        BankAccount(String name,int account_no,int id_no){
        this.name=name;
        this.account_no=account_no;
        this.id_no=id_no;
    }

    protected int account_no() {
        return account_no;
    }

    protected String name() {

            return name;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }
}
