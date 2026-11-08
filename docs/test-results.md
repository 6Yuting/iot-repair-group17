# 实际测试记录

语言与版本：Java（openjdk 17.0.14，Zulu17.56+15-CA，Windows）

测试人员GitHub用户名：Aya_1124124

运行命令：

```
cd src/java
javac StatusRule.java StatusRuleTest.java
java StatusRuleTest
```

| 编号 | 当前状态 | 目标状态 | 预期 | 实际 | 结论 |
| --- | --- | --- | --- | --- | --- |
| T01 | PENDING | PROCESSING | true | true | PASS |
| T02 | PROCESSING | COMPLETED | true | true | PASS |
| T03 | PENDING | COMPLETED | false | false | PASS |
| T04 | COMPLETED | PROCESSING | false | false | PASS |

## 原始输出

### 补齐规则前（起始代码，canTransition 直接返回 false）

```
T01 FAIL: PENDING -> PROCESSING, expected=true, actual=false
T02 FAIL: PROCESSING -> COMPLETED, expected=true, actual=false
T03 PASS: PENDING -> COMPLETED, expected=false, actual=false
T04 PASS: COMPLETED -> PROCESSING, expected=false, actual=false
Summary: 2/4 passed
```

退出码：1

### 补齐规则后

```
T01 PASS: PENDING -> PROCESSING, expected=true, actual=true
T02 PASS: PROCESSING -> COMPLETED, expected=true, actual=true
T03 PASS: PENDING -> COMPLETED, expected=false, actual=false
T04 PASS: COMPLETED -> PROCESSING, expected=false, actual=false
Summary: 4/4 passed
```

退出码：0

## 测试范围

本次规定 4 项测试，其他状态组合是否额外执行：未额外执行。函数实现对两条允许规则以外的输入统一返回 false，因此状态不变、跳级、回退等组合都会被拒绝。

从个人分支下载ZIP复测情况：已从 feat/status-c 下载 ZIP 到新目录执行，结果 4/4 passed，退出码 0

从main下载ZIP最终复测情况：待填写（合并后执行，或在submission.md记录）。
