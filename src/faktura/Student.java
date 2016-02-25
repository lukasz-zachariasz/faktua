/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktura;

/**
 *
 * @author Reniferek
 */
class Student {

    private String firstName;
    private String lastName;
    private String id;

    /**
     * *
     *
     * @param firstName sets Student's first name
     * @param lastName sets Student's last name
     * @param id sets Student's index number, must contains 6 digits
     */
    Student(String firstName, String lastName, String id) throws WrongIdException {
        if (id.matches("[0-9]{6}?")) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        } else {
            throw new WrongIdException();
        }

    }
    
    String getFirstName(){
        return this.firstName;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    String getLastName(){
        return this.lastName;
    }
    
    void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    String getId(){
        return this.id;
    }

    void setId(String id) throws WrongIdException {
        if (id.matches("[0-9]{6}?")) {

            this.id = id;
        } else {
            throw new WrongIdException();
        }
    }

}
