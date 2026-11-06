from status_rule import can_transition
import sys

CASES = [
    ("T01", "PENDING", "PROCESSING", True),
    ("T02", "PROCESSING", "COMPLETED", True),
    ("T03", "PENDING", "COMPLETED", False),
    ("T04", "COMPLETED", "PROCESSING", False),
]

if __name__ == "__main__":
    passed = 0
    for name, current, target, expected in CASES:
        actual = can_transition(current, target)
        ok = actual is expected
        passed += int(ok)
        verdict = "PASS" if ok else "FAIL"
        print(f"{name} {verdict}: {current} -> {target}, "
              f"expected={expected}, actual={actual}")
    print(f"Summary: {passed}/{len(CASES)} passed")
    sys.exit(0 if passed == len(CASES) else 1)
