package org.testng;

public abstract class DescribedTest implements ITest {
	
	protected static final ThreadLocal<String> m_testName = new ThreadLocal<String> () {
        @Override
        protected String initialValue() {
            return "";
        }
    };
	
	protected void setTestDescription(String testDescription) {
		m_testName.set(testDescription);
	}
	
	protected String getTestDescription() {
		return m_testName.get();
	}
	
	@Override
	public String getTestName() {
		return m_testName.get();
	}

}
