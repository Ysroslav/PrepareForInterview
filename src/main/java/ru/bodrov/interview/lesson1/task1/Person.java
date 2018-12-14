package ru.bodrov.interview.lesson1.task1;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;

    public Person(
            final String firstName,
            final String lastName,
            final String middleName,
            final String country,
            final String address,
            final String phone,
            final int age,
            final String gender){

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class Builder{

        private String nestedFirstName;
        private String nestedLastName;
        private String nestedMiddleName;
        private String nestedCountry;
        private String nestedAddress;
        private String nestedPhone;
        private int nestedAge;
        private String nestedGender;

        public Builder setNestedFirstName(String nestedFirstName) {
            this.nestedFirstName = nestedFirstName;
            return this;
        }

        public Builder setNestedLastName(String nestedLastName) {
            this.nestedLastName = nestedLastName;
            return this;
        }

        public Builder setNestedMiddleName(String nestedMiddleName) {
            this.nestedMiddleName = nestedMiddleName;
            return this;
        }

        public Builder setNestedCountry(String nestedCountry) {
            this.nestedCountry = nestedCountry;
            return this;
        }

        public Builder setNestedAddress(String nestedAddress) {
            this.nestedAddress = nestedAddress;
            return this;
        }

        public Builder setNestedPhone(String nestedPhone) {
            this.nestedPhone = nestedPhone;
            return this;
        }

        public Builder setNestedAge(int nestedAge) {
            this.nestedAge = nestedAge;
            return this;
        }

        public Builder setNestedGender(String nestedGender) {
            this.nestedGender = nestedGender;
            return this;
        }

        public Person build(){
            return new Person(
                    nestedFirstName,
                    nestedLastName,
                    nestedMiddleName,
                    nestedCountry,
                    nestedAddress,
                    nestedPhone,
                    nestedAge,
                    nestedGender
            );
        }
    }
}
