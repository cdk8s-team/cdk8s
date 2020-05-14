package crontab;

import static java.util.Arrays.asList;

import java.util.List;
import software.amazon.jsii.JsiiModule;

public final class $Module extends JsiiModule {
    public $Module() {
        super("crontab", "0.0.0", $Module.class, "crontab@0.0.0.jsii.tgz");
    }

    @Override
    public List<Class<? extends JsiiModule>> getDependencies() {
        return asList(org.cdk8s.$Module.class, software.constructs.$Module.class);
    }

    @Override
    protected Class<?> resolveClass(final String fqn) throws ClassNotFoundException {
        switch (fqn) {
            case "crontab.CronTab": return crontab.CronTab.class;
            case "crontab.CronTabOptions": return crontab.CronTabOptions.class;
            case "crontab.CronTabSpec": return crontab.CronTabSpec.class;
            default: throw new ClassNotFoundException("Unknown JSII type: " + fqn);
        }
    }
}
