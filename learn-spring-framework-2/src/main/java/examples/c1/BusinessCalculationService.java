package examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Configuration
@Service
@ComponentScan
public class BusinessCalculationService {
    private DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BusinessCalculationService.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        BusinessCalculationService service = context.getBean(BusinessCalculationService.class);
        System.out.println(service.findMax());
    }
}
