package io.github.julioamorim.ClassAndObjects;

//class definition
//a class can represent / abstract any aspect of the real world
public class Apartment {
    public int sizeM2Apartment;
    public int floorsApartment;
    public double valuationApartment;
    public int vacanciesNumberApartment;

    public int getSizeM2Apartment() {
        return sizeM2Apartment;
    }

    public void setSizeM2Apartment(int sizeM2Apartment) {
        this.sizeM2Apartment = sizeM2Apartment;
    }

    public int getFloorsApartment() {
        return floorsApartment;
    }

    public void setFloorsApartment(int floorsApartment) {
        this.floorsApartment = floorsApartment;
    }

    public double getValuationApartment() {
        return valuationApartment;
    }

    public void setValuationApartment(double valuationApartment) {
        this.valuationApartment = valuationApartment;
    }

    public int getVacanciesNumberApartment() {
        return vacanciesNumberApartment;
    }

    public void setVacanciesNumberApartment(int vacanciesNumberApartment) {
        this.vacanciesNumberApartment = vacanciesNumberApartment;
    }
}
