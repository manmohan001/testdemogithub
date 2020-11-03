set root=D:\Nhance_Automation_Workspace\github\nhance-automation-qa-web
CD /D %root% 
allure serve target\allure-results >> D:\Nhance_Automation_Workspace\nhance-web-parallel\src\main\resources\CommandText\CMDLog.txt
pause

