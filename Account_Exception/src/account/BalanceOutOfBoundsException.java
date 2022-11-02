package account;

public class BalanceOutOfBoundsException extends RuntimeException {
    public BalanceOutOfBoundsException(){
            super("인출 오류: 잔액을 초과하였습니다");
    }
}
