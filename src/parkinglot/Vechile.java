package parkinglot;

public class Vechile {

    private String type;
    private String regNo;
    private String color;

    Vechile(String type , String regNo , String color){
        this.type = type;
        this.regNo = regNo;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
