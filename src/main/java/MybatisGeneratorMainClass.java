import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisGeneratorMainClass {

    public static MybatisGeneratorMainClass own = new MybatisGeneratorMainClass();

    public static void main(String[] args) throws Exception {
        try {
            own.generator();
            System.out.println("Mybatisgenerator逆向工程生成完毕！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        InputStream resourceAsStream = own.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");
        Configuration config = cp.parseConfiguration(resourceAsStream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
