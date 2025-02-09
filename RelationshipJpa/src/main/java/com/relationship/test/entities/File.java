package com.relationship.test.entities;

import java.util.Arrays;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class File {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	private String name;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[]data;
	public File() {
		super();
		// TODO Auto-generated constructor stub
	}
	public File(int imageId, String name, byte[] data) {
		super();
		this.imageId = imageId;
		this.name = name;
		this.data = data;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "File [imageId=" + imageId + ", name=" + name + ", data=" + Arrays.toString(data) + "]";
	}
	
	
	
	
}
