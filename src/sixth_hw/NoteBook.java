package sixth_hw;

import java.util.Objects;

public class NoteBook {

    private String model;
    private String OS;
    private String color;
    private int RAM;
    private int HDD;

    public NoteBook(String model, String OS, String color, int RAM, int HD) {
        this.model = model;
        this.OS = OS;
        this.color = color;
        this.RAM = RAM;
        this.HDD = HD;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return RAM == noteBook.RAM && HDD == noteBook.HDD && Objects.equals(model, noteBook.model) && Objects.equals(OS, noteBook.OS) && Objects.equals(color, noteBook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, OS, color, RAM, HDD);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "model='" + model + '\'' +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                ", HD=" + HDD +
                '}';
    }
}
