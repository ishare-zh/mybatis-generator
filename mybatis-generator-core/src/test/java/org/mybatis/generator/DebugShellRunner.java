package org.mybatis.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 三清 on 15/8/20.
 */
public class DebugShellRunner {

    public static void main(String[] args) {
        String filename = "/Users/oshare/Workspce/tqmall/mybatis_web_generate.xml";
        File configurationFile = new File(filename);

        List<String> warnings = new ArrayList<String>();
        Set<String> contexts = new HashSet<String>();
        Set<String> fullyqualifiedTables = new HashSet<String>();
        try {
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configurationFile);

            DefaultShellCallback shellCallback = new DefaultShellCallback(true);

            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);

            ProgressCallback progressCallback = null;

            myBatisGenerator.generate(progressCallback, contexts, fullyqualifiedTables);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
