package lang.print.gaps.task5;

public class TimeConvertor {
    //float second;
    public void convert(float minutes) {
        System.out.println(minutes *60);
    }

    public static void main(String[] args) {
        TimeConvertor obj = new TimeConvertor();
        obj.convert(3);
    }
}


