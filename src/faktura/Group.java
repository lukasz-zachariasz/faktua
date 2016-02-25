/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktura;

import java.util.List;

/**
 *
 * @author Reniferek
 */
public class Group {

    private List<Student> members;
    private String name;

    Group(String name, List<Student> members) {
        this.name = name;
        this.members = members;
    }

    List<Student> getStudentsList() {
        return members;
    }

    void setStudentList(List<Student> members) {
        this.members = members;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void addStudent(Student newStudent) {
        members.add(newStudent);
    }

    void removeStudent(String id) throws WrongIdException {
        if (id.matches("[0-9]{6}?")) {
            for (Student s : members) {
                if (s.getId().equals(id)) {
                    members.remove(s);
                }
            }
        } else {
            throw new WrongIdException();
        }
    }

    void updateStudent(Student newStudent, String oldId) throws WrongIdException {
        if (oldId.matches("[0-9]{6}?")) {
            for (Student s : members) {
                if (s.getId().equals(oldId)) {
                    s.setFirstName(newStudent.getFirstName());
                    s.setId(newStudent.getId());
                    s.setLastName(newStudent.getLastName());
                }
            }
        } else {
            throw new WrongIdException();
        }
    }
}
