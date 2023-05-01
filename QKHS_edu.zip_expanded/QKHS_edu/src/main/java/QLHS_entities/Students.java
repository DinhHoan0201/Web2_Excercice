package QLHS_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hoc_sinh")
public class Students {
	@Id
	  @Column(name = "ma_hoc_sinh")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int ma_hoc_sinh;
	  @Column(name = "ho_ten")
	  private String ho_ten;
	  @Column (name="ngay_sinh")
	  private String ngay_sinh;
	  @Column(name = "gioi_tinh")
	  private String gioi_tinh;
	  @Column(name = "dia_chi")
	  private String dia_chi;
	  @Column(name = "so_dien_thoai")
	  private String so_dien_thoai;
	  @Column(name = "email")
	  private String email;
	public int getMa_hoc_sinh() {
		return ma_hoc_sinh;
	}
	public void setMa_hoc_sinh(int ma_hoc_sinh) {
		this.ma_hoc_sinh = ma_hoc_sinh;
	}
	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public String getNgay_sinh() {
		return ngay_sinh;
	}
	public void setNgay_sinh(String ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}
	public String getGioi_tinh() {
		return gioi_tinh;
	}
	public void setGioi_tinh(String gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getSo_dien_thoai() {
		return so_dien_thoai;
	}
	public void setSo_dien_thoai(String so_dien_thoai) {
		this.so_dien_thoai = so_dien_thoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	  
	  //getter; setter
	  
	  
	  

}
