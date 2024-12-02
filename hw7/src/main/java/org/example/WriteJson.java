package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class WriteJson {

    private static final Logger log = Logger.getLogger(WriteJson.class.getName());

    public static void main(String[] args) throws JsonProcessingException {

        Account account = new Account("Ali",100);
        Transaction transaction = new Transaction("Reza", 200.2,"send");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("account.json"), account);
            objectMapper.writeValue(new File("transaction.json"), transaction);
            log.info("Data has been written to JSON files successfully!");

        } catch (IOException e) {
            log.warning("can not write to JSON files successfully!");
            e.printStackTrace();
        }

    }

    @Data
    static class Account {

        private String name;
        private double balances;
        private Json.Transaction transaction;


        public Account(String ali, int i) {
            this.name = ali;
            this.balances = i;

        }
    }

    @Data
    static class Transaction {

        private String to;
        private double amount;
        private String desc;

        public Transaction(String reza, double v, String send) {
            this.to = reza;
            this.amount = v;
            this.desc = send;

        }
    }

}
