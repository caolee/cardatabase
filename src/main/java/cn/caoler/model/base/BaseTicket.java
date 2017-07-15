package cn.caoler.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTicket<M extends BaseTicket<M>> extends Model<M> implements IBean {

	public void setPrice(java.lang.Integer price) {
		set("price", price);
	}

	public java.lang.Integer getPrice() {
		return get("price");
	}

	public void setTotal(java.lang.Integer total) {
		set("total", total);
	}

	public java.lang.Integer getTotal() {
		return get("total");
	}

	public void setSold(java.lang.Integer sold) {
		set("sold", sold);
	}

	public java.lang.Integer getSold() {
		return get("sold");
	}

	public void setLast(java.lang.Integer last) {
		set("last", last);
	}

	public java.lang.Integer getLast() {
		return get("last");
	}

}