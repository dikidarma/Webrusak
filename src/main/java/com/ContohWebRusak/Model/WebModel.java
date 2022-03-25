package com.ContohWebRusak.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "web")
public class WebModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	private String nama;
	private String gambar;
	private String judul;
	private String deskripsi;
	private String tanggal;
	
}
