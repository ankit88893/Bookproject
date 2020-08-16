package com.dxctraining.ui;

import com.dxctraining.config.JavaConfig; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

    }

}
