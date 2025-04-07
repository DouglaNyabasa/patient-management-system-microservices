package com.pm.billingservice;

import billing.BillingServiceGrpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BillingServiceApplication extends BillingServiceGrpc.BillingServiceImplBase {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

}
