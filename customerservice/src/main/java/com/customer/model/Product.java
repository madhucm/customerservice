package com.customer.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Product")
public class Product {
	
	
	/*@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public Product() {
		
	}
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private Set<ProductImage> productImages;
	
	public Set<ProductImage> getProductImages() {
		return productImages;
	}
	public void setProductImages(Set<ProductImage> productImages) {
		this.productImages = productImages;
	}

	@Column(name="product_name")
	private String productName;
	
	@Column(name="seller_name")
	private String seller;
	
	@Column(name="price")
	private int price;
	
	@Column(name="category")
	private String category;
	
	@Column(name="hash_tag")
	private String hashtag;
	
	@Column(name="description")
	private String description;
	
	@Column
	@CreationTimestamp
	private LocalDateTime createDateTime;

	@Column
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getHashTag() {
		return hashtag;
	}

	public void setHashTag(String hashTag) {
		this.hashtag = hashTag;
	}

	/*public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productImages=" + productImages + ", productName=" + productName + ", seller="
				+ seller + ", price=" + price + ", category=" + category + ", hashtag=" + hashtag + ", description="
				+ description + ", createDateTime=" + createDateTime + ", updateDateTime=" + updateDateTime + "]";
	}
	
	

	
}
