package generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorUtil {
	 
	private static void generator() throws Exception {
		 List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("d://maven_exercise/exercise/mybatis_generator/src/main/resources/generatorConfig.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   org.mybatis.generator.config.Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}
	
	public static void main(String[] args) {
		try {
			generator();
		} catch (Exception e) {
			System.out.println("產生失敗");
			e.printStackTrace();
		}
	}
}
