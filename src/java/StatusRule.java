public class StatusRule {
    public enum Status { PENDING, PROCESSING, COMPLETED }

    public static boolean canTransition(Status current, Status target) {
        // start repair: PENDING -> PROCESSING
        if (current == Status.PENDING && target == Status.PROCESSING) {
            return true;
        }
        // finish repair: PROCESSING -> COMPLETED
        if (current == Status.PROCESSING && target == Status.COMPLETED) {
            return true;
        }
        // skip, rollback, same state and anything else are rejected
        return false;
    }
}
