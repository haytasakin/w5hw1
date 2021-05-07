package core;

import gLogger.GLoggerManager;

public class GLoggerManagerAdapter implements LoggerManager {

	@Override
	public void logToSystem(String message) {
		

		GLoggerManager manager=new GLoggerManager();
		manager.log(message);
	}

}
