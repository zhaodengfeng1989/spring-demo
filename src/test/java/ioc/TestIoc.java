package ioc;import com.alibaba.druid.pool.DruidDataSource;import com.zhaodf.beans.Child;import com.zhaodf.beans.Husband;import com.zhaodf.beans.Kid;import com.zhaodf.beans.Parent;import com.zhaodf.beans.Person;import com.zhaodf.beans.SpELBean;import com.zhaodf.beans.User;import org.junit.Before;import org.junit.Test;import org.springframework.context.ApplicationContext;import org.springframework.context.support.ClassPathXmlApplicationContext;import org.springframework.expression.EvaluationContext;import org.springframework.expression.ExpressionParser;import org.springframework.expression.spel.standard.SpelExpressionParser;import org.springframework.expression.spel.support.SimpleEvaluationContext;import java.sql.Connection;import java.sql.ResultSet;import java.sql.SQLException;import java.sql.Statement;/** * 类：TestIoc * * @author zhaodf * @date 2021/1/21 */public class TestIoc {    //ApplicationContext 容器顶层核心接口    //ClassPathXmlApplicationContext 从项目的资源文件中加载xml配置文件来初始化IoC容器    //FileSystemXmlApplicationContext 从本地（电脑）的磁盘路径加载xml配置文件来初始化IoC容器    //AnnotationConfigApplicationContext 使用注解配置的方式来初始化IoC容器    //在容器实例化的时候就会加载所有的bean,如何证明？如果在打印“Spring容器加载完成”前先打印User无参构造的“User已加载”    ClassPathXmlApplicationContext ioc;    @Before    public void before(){        ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");        System.out.println("Spring容器加载完成");    }    @Test    public void test01(){       User user = ioc.getBean("user1",User.class);       System.out.println(user);    }    @Test    public void test02(){        //注意，这里使用name+class的形式，可以区分相同类型的不同bean        User user = ioc.getBean("user2",User.class);        System.out.println(user);    }    @Test    public void test03(){        //注意，这里使用name+class的形式，可以区分相同类型的不同bean        User user = ioc.getBean("user3",User.class);        System.out.println(user);    }    @Test    public void test04(){        //注意，这里使用name+class的形式，可以区分相同类型的不同bean        Person person = ioc.getBean("person",Person.class);        System.out.println(person);    }    @Test    public void test05(){        User user = ioc.getBean("user5",User.class);        System.out.println(user);    }    @Test    public void test06(){        User user = ioc.getBean("user",User.class);        System.out.println(user);    }    @Test    public void test07(){        User user = ioc.getBean("user",User.class);        System.out.println(user);    }    @Test    public void test08(){        User user1 = ioc.getBean("user8",User.class);        User user2 = ioc.getBean("user8",User.class);        System.out.println(user1==user2);    }    @Test    public void test09(){        User user1 = ioc.getBean("user9",User.class);        User user2 = ioc.getBean("user9",User.class);        System.out.println(user1==user2);    }    @Test    public void test10(){        User user = ioc.getBean("user10",User.class);        System.out.println(user);    }    @Test    public void test11(){        User user = ioc.getBean("user11",User.class);        System.out.println(user);    }    @Test    public void test12(){        Husband husband = ioc.getBean("husband",Husband.class);        System.out.println(husband);    }    @Test    public void test13(){        Person person = ioc.getBean("person",Person.class);        System.out.println(person);        ioc.close();    }    @Test    public void test14(){        Kid kid = ioc.getBean("kid",Kid.class);        System.out.println(kid);        Parent parent = ioc.getBean("parent",Parent.class);        System.out.println(parent);    }    @Test    public void test15() throws SQLException {        DruidDataSource dataSource = ioc.getBean("dataSource",DruidDataSource.class);        Connection con = dataSource.getConnection();        Statement statement = con.createStatement();        ResultSet rs = statement.executeQuery("select * from user");        while (rs.next()){            String id = rs.getString(1);            System.out.println(id);        }    }    @Test    public void test16(){        SpELBean spELBean = ioc.getBean("spELBean",SpELBean.class);        System.out.println(spELBean);    }}