package model;
// Generated 11 nov. 2017 18:56:02 by Hibernate Tools 5.1.5.Final

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Rent generated by hbm2java
 */
@Entity
@Table(name = "cartItem", catalog = "Mes_Transports")
public class CartItem implements java.io.Serializable {

	private Integer id;
	private int idUser;
	private int idVehicle;
	private float totalPrice;
	private Date startDate;
	private Date endDate;
	private String locationIn;
	private String locationOut;

	public CartItem() {
	}

	public CartItem(int idUser, int idVehicle, float totalPrice, Date startDate, Date endDate) {
		this.idUser = idUser;
		this.idVehicle = idVehicle;
		this.totalPrice = totalPrice;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public CartItem(int idUser, int idVehicle, float totalPrice, Date startDate, Date endDate, String locationIn,
					String locationOut) {
		this.idUser = idUser;
		this.idVehicle = idVehicle;
		this.totalPrice = totalPrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.locationIn = locationIn;
		this.locationOut = locationOut;
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

	@Column(name = "idUser", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "idVehicle", nullable = false)
	public int getIdVehicle() {
		return this.idVehicle;
	}

	public void setIdVehicle(int idVehicle) {
		this.idVehicle = idVehicle;
	}

	@Column(name = "total_price", nullable = false, precision = 12, scale = 0)
	public float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 0)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 0)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "location_in", length = 65535)
	public String getLocationIn() {
		return this.locationIn;
	}

	public void setLocationIn(String locationIn) {
		this.locationIn = locationIn;
	}

	@Column(name = "location_out", length = 65535)
	public String getLocationOut() {
		return this.locationOut;
	}

	public void setLocationOut(String locationOut) {
		this.locationOut = locationOut;
	}

}
