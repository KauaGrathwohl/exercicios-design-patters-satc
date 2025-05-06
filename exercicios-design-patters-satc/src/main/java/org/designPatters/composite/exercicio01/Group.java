package org.designPatters.composite.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Group implements ContactComponent {
    private String groupName;
    private List<ContactComponent> members = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void add(ContactComponent contact) {
        members.add(contact);
    }

    public void remove(ContactComponent contact) {
        members.remove(contact);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ Grupo: " + groupName);
        for (ContactComponent member : members) {
            member.showDetails(indent + "  ");
        }
    }

    @Override
    public boolean search(String name) {
        for (ContactComponent member : members) {
            if (member.search(name)) {
                return true;
            }
        }
        return false;
    }

    public String getGroupName() {
        return groupName;
    }
}
