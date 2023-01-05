package Calculator;

public class Calculator1 {


    private int num1;
    private int num2;
    private int num3;
    private int num4;

    Calculator1(int _num1, int _num2, int _num3, int _num4) {
        this.num1 = _num1;
        this.num2 = _num2;
        this.num3 = _num3;
        this.num4 = _num4;


    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int _num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;

    }

    public void setNum2(int _num2) {
        this.num2 = num2;

    }

    public int getNum3() {
        return num3;

    }

    public void setNum3(int _num3) {
        this.num3 = num3;

    }

    public int getNum4() {
        return num4;

    }

    public void setNum4(int _num4) {
        this.num4 = num4;
    }



public  void Addition(){
    System.out.println(num1+num2+num3+num4);
    }
    public  void  Substraction(){
        System.out.println(num1-num2-num3-num4);
    }public  void  Multiplication(){
        System.out.println(num1*num2*num3*num4);
    }public  void  Division(){
        System.out.println(num1%num2%num3%num4);
    }
}