package exceptions;
/**
 *
 *  A subclass of HearthstoneException representing an exception that occurs when the
 * current minion cannot be used to attack. This can occur if the minion is sleeping or has already
 * been used to attack this turn.
 *
 * **/
public class CannotAttackException extends HearthstoneException {

    public CannotAttackException() {
    }

    public CannotAttackException(String s) {
        super(s);
    }
}
