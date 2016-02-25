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
public interface GroupDAOInterface {
    public List<Student> getStudentsList();
    public void removeStudent(String id);
    public void addStudent(Student newStudent);
    public void updateStudent(Student newStudent, String oldId);
    public void removeGroup();
}
