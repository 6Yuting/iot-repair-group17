# 校园物联网设备报修实验

组号：待填写

成员A GitHub用户名：待填写

成员B GitHub用户名：待填写

成员C GitHub用户名：待填写

本组选定语言：Java / Python 二选一，保留一项。

## 范围
只分析查看设备、提交报修、更新状态。只编程实现状态判断函数。
不接入真实硬件，不实现数据库、网页、登录或MQTT。

## 固定规则
新工单为PENDING。仅允许PENDING转PROCESSING、PROCESSING转COMPLETED。
其他转换一律拒绝，包括状态不变。

## 分工
A完成docs/requirements.md与docs/usecase.md及图文件。
B完成docs/models.md及图文件。
C完成一种语言的函数与docs/test-results.md。
图文件放docs/assets，保留可编辑源材料。
三个主要PR合并后，由A另开分支整理docs/submission.md。

## 运行
Python：进入src/python，运行python test_status_rule.py。
Java：进入src/java，先javac StatusRule.java StatusRuleTest.java，
再java StatusRuleTest。

起始函数尚未实现，预期2项FAIL、2项PASS、退出码1。
完成函数后，规定4项测试应全部PASS、退出码0。
不要修改测试预期来获得通过，也不提交.class或__pycache__。

## 协作
每人一个个人分支和主要PR，交叉评审后合入main。
初始化之外不直接写main。操作详见配套GitHub教程。
