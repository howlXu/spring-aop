package aop.test;

/**
 * @author Howl
 * 本demo參考https://www.cnblogs.com/xxdsan/p/6496332.html
 */
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import base.BaseTest;
import demo.Skill;
import demo.Student;
import spring.SpringConfig;
@ContextConfiguration(classes = SpringConfig.class)
public class AopTest extends BaseTest {

	@Autowired
    private Student student;

    /**
     * 测试spring aop的切入方法。即动态为一个类新增一个接口，并且实现了接口中的方法。
     */
    @Test
    public void testQR(){
        Skill skill = (Skill)student; // 通过类型转换，student对象就拥有了SkillImp 类的方法
        skill.getSkill("我会英语");
        student.sayIdentification();
    }
    
    /**
     * 測試spring aop的織入方法。
     */
    @Test
    public void testZR() {
    	student.sayIdentification();
    }
}
