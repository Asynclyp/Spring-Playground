package examples.a1;

import com.yuanpeng.learn_spring_framework.game.GameConsole;
import com.yuanpeng.learn_spring_framework.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusinessClass{
    //Field injection
    //@Autowired
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;

    //Constructor injection
    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //Setter injection
    //    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    public String toString(){
        return "Using dependency1: " + dependency1.toString() + " dependency2: " + dependency2.toString();
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
