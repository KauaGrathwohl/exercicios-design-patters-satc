package org.designPatters.composite.exercicio01;

public class Person implements ContactComponent {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- Pessoa: " + name + " | Email: " + email);
    }

    @Override
    public boolean search(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    public String getName() {
        return name;
    }
}
