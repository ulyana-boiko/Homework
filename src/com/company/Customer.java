    package com.company;

    public class Customer implements Comparable<Customer> {
        private int id;
        private String surname;
        private String name;
        private String fatherName;
        private String adress;
        private int cardID;
        private int bankAccount;

        public Customer(int id, String surname, String name, String fatherName, String adress, int cardID, int bankAccount) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.fatherName = fatherName;
            this.adress = adress;
            this.cardID = cardID;
            this.bankAccount = bankAccount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public int getCardID() {
            return cardID;
        }

        public void setCardID(int cardID) {
            this.cardID = cardID;
        }

        public int getBankAccount() {
            return bankAccount;
        }

        public void setBankAccount(int bankAccount) {
            this.bankAccount = bankAccount;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", fatherName='" + fatherName + '\'' +
                    ", adress='" + adress + '\'' +
                    ", cardID=" + cardID +
                    ", bankAccount=" + bankAccount +
                    '}';
        }

        @Override
        public int compareTo(Customer o) {
            return 0;
        }
    }

