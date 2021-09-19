package com.miu.contact;


public class Contact {
    private String firstName;
    private String lastName;
    private String mobile;
    Contact(String fname, String lname, String mobile){
        this.firstName = fname;
        this.lastName = lname;
        this.mobile= mobile;
    }

    public void validateFirstName(){
        if(firstName.isBlank()){
            throw new RuntimeException("First name can not be blank");
        }
    }

    public void validateLastName(){
        if(lastName.isBlank()){
            throw new RuntimeException("Last name can not be blank");
        }
    }

    public void validateMobile(){
        if(mobile.isBlank()){
            throw new RuntimeException("Mobile field can not be blank");
        }

        if(mobile.length() != 10){
            throw new RuntimeException("Mobile phone number length must be 10");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

}
