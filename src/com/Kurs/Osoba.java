package com.Kurs;

import java.util.Objects;

public class Osoba implements Comparable<Osoba>{
    String name;
    String surname;
    int age;

    public Osoba(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Osoba o) {
        if (this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba)) return false;
        Osoba osoba = (Osoba) o;
        return age == osoba.age &&
                Objects.equals(name, osoba.name) &&
                Objects.equals(surname, osoba.surname);
    }

    @Override
    public int hashCode() {

        return this.name.length()+this.surname.length()+this.age;
    }
}
