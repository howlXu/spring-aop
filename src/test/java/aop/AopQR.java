package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import demo.Skill;
import demo.SkillImpl;

/**
 * 
 * @author Howl
 * Aop切入，我也不知道切入的英文该怎么翻译，直接用中文简写了。
 * 所谓切入是指为一个类动态的增加方法。
 *
 */
@Component
@Aspect
public class AopQR {
	// “...aop.Person”后面的 “+” 号，表示只要是Person及其子类都可以添加新的方法
    @DeclareParents(value = "demo.Person+", defaultImpl = SkillImpl.class)
    public Skill skill;
}
