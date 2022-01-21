package org.iesfm.library;

import java.util.Objects;

public class Member {
    private String nif;
    private String name;
    private String surname;
    private int memberNumber;
    private int zipCode;

    public Member(String nif, String name, String surname, int memberNumber, int zipCode) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.memberNumber = memberNumber;
        this.zipCode = zipCode;
    }

    public void showInfo() {
        System.out.println(
                "NIF: " + nif + ". Nombre: " + name + ". Apellidos: " + surname + ". Número de socio: " + memberNumber + ". Código postal: " + zipCode
        );
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return getMemberNumber() == member.getMemberNumber() && getZipCode() == member.getZipCode() && Objects.equals(getNif(), member.getNif()) && Objects.equals(getName(), member.getName()) && Objects.equals(getSurname(), member.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNif(), getName(), getSurname(), getMemberNumber(), getZipCode());
    }
}
