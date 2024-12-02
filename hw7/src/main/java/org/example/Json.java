package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

public class Json {

    public static void main(String[] args) throws JsonProcessingException {
        String json = """
                {
                   "name": "Ali",
                   "balances": 100,
                   "transaction": {
                     "to": 102030,
                     "amount": 1000,
                     "desc": "send"
                   }
                }
                """;
        ObjectMapper mapper = new ObjectMapper();
        Account account = mapper.readValue(json, Account.class);
        System.out.println(account);


    }

    @Data
    static class Account {

        private String name;
        private double balances;
        private Transaction transaction;

    }

    @Data
    static class Transaction {

        private String to;
        private double amount;
        private String desc;

    }

}
