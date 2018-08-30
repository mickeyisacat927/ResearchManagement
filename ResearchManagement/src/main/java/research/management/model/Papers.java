package main.java.research.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "papers")
public class Papers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	Integer id;
	Short vol_num;
	String title;
	Short page_start;
	Short page_end;

	@Column(columnDefinition = "tinyint")
	Short pages;

	@Column(name = "abstract", columnDefinition = "text")
	String abstractColumn;

	String pdf;
	String pub_pdf;
	String ref_bibtex;
	String ref_endnote;
	Short order_vol;

	@Column(columnDefinition = "tinyint")
	Short type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getVol_num() {
		return vol_num;
	}

	public void setVol_num(Short vol_num) {
		this.vol_num = vol_num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Short getPage_start() {
		return page_start;
	}

	public void setPage_start(Short page_start) {
		this.page_start = page_start;
	}

	public Short getPage_end() {
		return page_end;
	}

	public void setPage_end(Short page_end) {
		this.page_end = page_end;
	}

	public Short getPages() {
		return pages;
	}

	public void setPages(Short pages) {
		this.pages = pages;
	}

	public String getAbstractColumn() {
		return abstractColumn;
	}

	public void setAbstractColumn(String abstractColumn) {
		this.abstractColumn = abstractColumn;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public String getPub_pdf() {
		return pub_pdf;
	}

	public void setPub_pdf(String pub_pdf) {
		this.pub_pdf = pub_pdf;
	}

	public String getRef_bibtex() {
		return ref_bibtex;
	}

	public void setRef_bibtex(String ref_bibtex) {
		this.ref_bibtex = ref_bibtex;
	}

	public String getRef_endnote() {
		return ref_endnote;
	}

	public void setRef_endnote(String ref_endnote) {
		this.ref_endnote = ref_endnote;
	}

	public Short getOrder_vol() {
		return order_vol;
	}

	public void setOrder_vol(Short order_vol) {
		this.order_vol = order_vol;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

}