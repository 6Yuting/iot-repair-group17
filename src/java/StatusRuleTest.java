public class StatusRuleTest {
    private static int passed = 0;

    private static void check(String name, StatusRule.Status current,
                              StatusRule.Status target, boolean expected) {
        boolean actual = StatusRule.canTransition(current, target);
        boolean ok = actual == expected;
        if (ok) passed++;
        System.out.println(name + (ok ? " PASS: " : " FAIL: ")
            + current + " -> " + target
            + ", expected=" + expected + ", actual=" + actual);
    }

    public static void main(String[] args) {
        check("T01", StatusRule.Status.PENDING,
              StatusRule.Status.PROCESSING, true);
        check("T02", StatusRule.Status.PROCESSING,
              StatusRule.Status.COMPLETED, true);
        check("T03", StatusRule.Status.PENDING,
              StatusRule.Status.COMPLETED, false);
        check("T04", StatusRule.Status.COMPLETED,
              StatusRule.Status.PROCESSING, false);
        System.out.println("Summary: " + passed + "/4 passed");
        System.exit(passed == 4 ? 0 : 1);
    }
}
