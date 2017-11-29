package model;
// Generated 11 nov. 2017 18:56:02 by Hibernate Tools 5.1.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vehicle generated by hbm2java
 */
@Entity
@Table(name = "vehicle", catalog = "Mes_Transports")
public class Vehicle implements java.io.Serializable {

	private Integer id;
	private int type;
	private String brand;
	private float price;
	private String insurance;
	private int idAgency;
	private boolean status;

	public Vehicle() {
	}

	public Vehicle(Vehicle vehicle) {
		this.brand = vehicle.getBrand();
		this.idAgency = vehicle.getIdAgency();
		this.insurance = vehicle.getInsurance();
		this.price = vehicle.getPrice();
		this.type = vehicle.getType();
		this.status = true;
	}

	public Vehicle(int type, String brand, float price, String insurance, int idAgency) {
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.insurance = insurance;
		this.idAgency = idAgency;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "brand", nullable = false, length = 50)
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "price", nullable = false, precision = 12, scale = 0)
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Column(name = "insurance", nullable = false, length = 50)
	public String getInsurance() {
		return this.insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Column(name = "idAgency", nullable = false)
	public int getIdAgency() {
		return this.idAgency;
	}

	public void setIdAgency(int idAgency) {
		this.idAgency = idAgency;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
