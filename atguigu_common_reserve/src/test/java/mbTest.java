import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mbTest {
    @Test
    public void test(){
        List<String> warnings = new ArrayList();
        boolean overwrite = true;
        File configFile = new File("D:\\编程\\PROJECT1\\untitledorc\\atguigu_common_reserve\\src\\main\\java\\mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;

        try {
            config = cp.parseConfiguration(configFile);
        } catch (IOException var13) {
            var13.printStackTrace();
        } catch (XMLParserException var14) {
            var14.printStackTrace();
        }

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;

        try {
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        } catch (InvalidConfigurationException var12) {
            var12.printStackTrace();
        }

        try {
            myBatisGenerator.generate((ProgressCallback)null);
        } catch (SQLException var9) {
            var9.printStackTrace();
        } catch (IOException var10) {
            var10.printStackTrace();
        } catch (InterruptedException var11) {
            var11.printStackTrace();
        }
    }
}
