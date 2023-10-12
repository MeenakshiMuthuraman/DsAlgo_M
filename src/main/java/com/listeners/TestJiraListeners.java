//package com.listeners;
//import org.testng.ITestListener;
//import org.apache.commons.lang.exception.ExceptionUtils;
//import org.testng.ITestContext;
//import org.testng.ITestResult;
//
//import com.qa.util.JiraPolicy;
//import com.qa.util.JiraServiceProvider;
//
//public class TestJiraListeners implements ITestListener{
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		// TODO Auto-generated method stub
//		//ITestListener.super.onTestFailure(result);
//		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
//		boolean isTicketReady = jiraPolicy.logTicketReady();
//		if(isTicketReady)
//		{
//			System.out.println("is Ticket ready for Jira: "+ isTicketReady);
//			JiraServiceProvider jirasp = new JiraServiceProvider("https://meenakshimuthuraman.atlassian.net", "m.meenamca@gmail.com", "ATATT3xFfGF00FwTtUUhBZRTXsdqGc5Bf4VsVqCbYvWUEkzvFEDaY3g-2j0FRgG7PC1Nv9trZ7ECrGSAF5ggiiPqyxwD61-OmAAgw7THibq6Q6yZe0nFIUvRFwHAiYB-wl0z5onsGTVlovEln0ZpaQNtYTI7KxGwOA0XCJGyfnIVclAw0nRa1d8=FBB35388","Practice_DsAlgo_M");
//			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() + "got failed";	
//			String issueDescription = result.getThrowable().getMessage()+"\n";
//			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
//			jirasp.createJiraTicket("Bug", issueSummary, issueDescription, "Meena");
//		}
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}
//
//}
