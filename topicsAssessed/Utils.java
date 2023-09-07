package topicsAssessed;

/**
 * From: https://stackoverflow.com/questions/4519557/is-there-a-way-to-throw-an-exception-without-adding-the-throws-declaration
 * @author tylerbrw
 *
 */
public class Utils {
	@SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwException(Throwable exception, Object dummy) throws T {
        throw (T) exception;
    }

    public static void throwException(Throwable exception) {
        Utils.<RuntimeException>throwException(exception, null);
    }
    
    public static void main(String[] args) {
        Utils.throwException(new Exception("This is an exception!"));
    }
}
