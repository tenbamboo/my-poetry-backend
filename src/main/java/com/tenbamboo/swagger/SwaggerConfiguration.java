package com.tenbamboo.swagger;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration 
@EnableWebMvc   
//@EnableSwagger2 
@ComponentScan("com.tenbamboo.controller") 
public class SwaggerConfiguration {
	
	
//    @Bean
//    public Docket getApiInfo() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("API")
//                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
////                .apis(RequestHandlerSelectors.basePackage("com.pharmeyes.healthstar.ph.svr.app.controller"))
//                .paths(PathSelectors.any())
////                .paths(paths())
//                .build();
//
//    }
//    private Predicate<String> paths() {
//        return or(regex("/app.*"));
//    }



//    @Bean
//    public UiConfiguration getUiConfig() {
//        return new UiConfiguration(
//                null,// url,暂不用
//                "none",       // docExpansion          => none | list
//                "alpha",      // apiSorter             => alpha
//                "schema",     // defaultModelRendering => schema
//                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
//                false,        // enableJsonEditor      => true | false
//                true);        // showRequestHeaders    => true | false
//    }
}