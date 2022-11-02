package account;

public class MalformedData extends Exception {
    public MalformedData (){
        super("오류:잘못된 금액입니다");
    }
}
