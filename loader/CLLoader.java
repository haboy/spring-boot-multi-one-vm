import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.Attributes;
import java.util.jar.JarFile;

/**
 * Created by albert on 16/12/21.
 */
public class CLLoader {

    public static void main(String[] args) throws Exception {
        launchApp(new File("/Users/albert/microservices/spring-boot-multi-one-vm/test/micro-common-0.0.1.SNAPSHOT.jar"));
        launchApp(new File("/Users/albert/microservices/spring-boot-multi-one-vm/test/service-consumer1-0.0.1.SNAPSHOT.jar"));
        launchApp(new File("/Users/albert/microservices/spring-boot-multi-one-vm/test/service-provider-0.0.1.SNAPSHOT.jar"));
    }

    private static void launchApp(File wrapperJar, String... args) throws Exception {
        ClassLoader classLoader = new URLClassLoader(new URL[] {wrapperJar.toURI().toURL()});
        System.err.println("classloader is "+classLoader);
        Class<?> mainClass = classLoader.loadClass(getMainClassName(wrapperJar));
        Method mainMethod = mainClass.getMethod("main", String[].class);
        mainMethod.invoke(null, new Object[] {args});
    }

    private static String getMainClassName(File jar) throws IOException {
        try (JarFile jarFile = new JarFile(jar)) {
            return jarFile.getManifest().getMainAttributes().getValue(Attributes.Name.MAIN_CLASS);
        }
    }

}
