package com.solt.jdc;

import com.solt.jdc.service.EmployeeReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan
public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(RunnerMain.class);
        EmployeeReportService employeeReportService=context.getBean(EmployeeReportService.class);

        employeeReportService.printReport();
    }
}
