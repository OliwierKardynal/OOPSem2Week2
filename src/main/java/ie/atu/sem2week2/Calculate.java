package ie.atu.sem2week2;

public class Calculate {
    private Integer num1;
    private Integer num2;
    private String operation;
    private Integer total;

    public Calculate(Integer num1, Integer num2, String operation){
        this.num1 = num1;
        this.num2 = num2;
        this.operation = "add";

    }
    public Calculate(){
        this.num1 = 0;
        this.num2 = 0;
        this.operation = "";
        this.total = 0;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
}
