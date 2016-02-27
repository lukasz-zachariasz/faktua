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

    public List<Group> getGroupList();

    public void addGroup(Group newGroup);

    public void getGroup(String name);

    public void updateGroup(Group newGroup, String oldId);

    public void removeGroup();
}
