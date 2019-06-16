package pl.edu.pjatk.tau;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
public class RubberBand {
    @GeneratedValue
    @Id
    private Long id;
    @Column
    private String brand;
    @Column
    private Long diameter;
    @Column
    private Long width;
    @Column
    private Long thickness;
    @Column
    private Long rubberContent;
    @Column
    private String color;
    @Column
    private String packageQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getDiameter() {
        return diameter;
    }

    public void setDiameter(Long diameter) {
        this.diameter = diameter;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getThickness() {
        return thickness;
    }

    public void setThickness(Long thickness) {
        this.thickness = thickness;
    }

    public Long getRubberContent() {
        return rubberContent;
    }

    public void setRubberContent(Long rubberContent) {
        this.rubberContent = rubberContent;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(String packageQuantity) {
        this.packageQuantity = packageQuantity;
    }
}
