package aashvik.aash3;

import com.agapsys.agreste.test.ColoredConsoleLogStream;
import com.agapsys.web.toolkit.modules.LogModule;

public class TestApplication extends Application {

	@Override
	public boolean isAbuseCheckEnabled() {
		return false; // <-- Required for tests
	}

	@Override
	protected void beforeApplicationStart() {
		super.beforeApplicationStart();

		LogModule logModule = getModule(LogModule.class);
		logModule.addStream(new ColoredConsoleLogStream());
	}

}
