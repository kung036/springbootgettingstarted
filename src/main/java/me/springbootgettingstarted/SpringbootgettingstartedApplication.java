package me.springbootgettingstarted;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringbootgettingstartedApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootgettingstartedApplication.class, args);

        // 위의 코드와 동일한 기능을 함(커스텀하기 위해서 아래와 같이 선언함)
//        SpringApplication app = new SpringApplication(SpringbootgettingstartedApplication.class);
//
//        // banner 설정
//        app.setBanner(new Banner() {
//            @Override
//            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//                out.println("------------------------");
//                out.println("banner ~~");
//                out.println("------------------------");
//            }
//        });
//
//        app.run(args);
        new SpringApplicationBuilder()
                .sources(SpringbootgettingstartedApplication.class)
                .banner(new Banner() {
                    @Override
                    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                        out.println("------------------------");
                        out.println("banner ~~");
                        out.println("------------------------");
                    }
                }).run(args);
    }
}
