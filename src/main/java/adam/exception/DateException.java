package adam.exception;

public class DateException extends AdamException {
    @Override
    public String getInfo() {
        return "OOPS!!! you need the date to be in a yyyy-mm-dd format";
    }
}
