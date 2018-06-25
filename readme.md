功能
============
针对团队需求，对官方mybatis-generator插件进行覆写，使其能满足团队编码过程中的规则遵循，便于统一。


### 重写的功能
- 生成文件名称可配置，增加`targetFilename`属性，如果不填写，默认是mybatis内建名
- 对mysql数据库映射的对象进行整合，使其JDBC类型（如`byte`、`bit`、`tinyint`、`mediumint`、`smallint`、`int`）可统一映射到`Java.lang.Integer`类型
- 通过添加`enableComments`属性，让`do`中映射的字段可自动添加注释，来自数据库表设计中的`comment`
- 增加`ignoreSetterAndGetter`属性，可以忽略生成`setter`和`getter`方法


### TODO LIST
- 可配置方法名
- 生成的mapper文件可以识别`dao`或`do`接口继承，从而对已继承的类忽略生成相应的属性、方法和配置