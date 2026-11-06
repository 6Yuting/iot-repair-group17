public class StatusRule {
    public enum Status { PENDING, PROCESSING, COMPLETED }

    public static boolean canTransition(Status current, Status target) {
        // TODO: allow PENDING -> PROCESSING
        // TODO: allow PROCESSING -> COMPLETED
        // Reject all other transitions.
        return false;
    }
}
