package chay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/07/20 23:27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.chaytech.api"} )
public class UserConsumerOpenFeignServer81_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerOpenFeignServer81_Application.class);
    }
}
