Created Time 2019-11

1. JDK版本要求： JDK1.8以上
2. 使用方法：
    2.1 generatorConfig.xml文件中配置下面标签：
        <jdbcConnection
                    driverClass="com.mysql.jdbc.Driver"
                    connectionURL="jdbc:mysql://IP地址:数据库访问端口/库名?其他参数"
                    userId="数据库用户名"
                    password="数据库连接密码">
        </jdbcConnection>
        例如：
        <jdbcConnection
                    driverClass="com.mysql.jdbc.Driver"
                    connectionURL="jdbc:mysql://127.0.0.1:3306/test"
                    userId="root"
                    password="123456">
        </jdbcConnection>
    2.2  generatorConfig.xml文件中配置下面标签:
        <table schema="" tableName="表名称"></table>
        例如：
        <table schema="" tableName="tb_user"></table>
    2.3 POM文件中根据需求更改版本控制信息，基本不用更改
    2.3 generatorConfig.xml文件中其他配置属性可以根据需求自己更改