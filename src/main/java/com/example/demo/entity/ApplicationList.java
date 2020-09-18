package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_tbl")
public class ApplicationList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "expenses_id")
	private int iExpensesId; // 経費管理ID
	
	@Column(name = "user_id", nullable = true)
	private int iUserId; // ユーザーID
	
	@Column(name = "content_id", nullable = true)
	private int iContentId; // コンテンツID
	
	@Column(name = "status_id", nullable = true)
	private int iStatusId; // ステータスID
	
	@Column(name = "money", nullable = true)
	private int iMoney; // 金額
	
	@Column(name = "reason", nullable = true)
	private String sReason; // 処理理由
	
	@Column(name = "is_user", nullable = true)
	private String sIsUser; // データ作成者
	
	@Column(name = "is_date", nullable = true)
	private String sIsDate; // データ作成日時
	
	@Column(name = "upd_user", nullable = true)
	private String sUpdUser; // 更新者
	
	@Column(name = "upd_date", nullable = true)
	private String sUpdDate; // 更新日時
	
	@Column(name = "is_deleted", nullable = true)
	private boolean sIsDeleted; // 削除フラグ
	
	public ApplicationList() {
	}

	public int getiExpensesId() {
		return iExpensesId;
	}

	public void setiExpensesId(int iExpensesId) {
		this.iExpensesId = iExpensesId;
	}

	public int getiUserId() {
		return iUserId;
	}

	public void setiUserId(int iUserId) {
		this.iUserId = iUserId;
	}

	public int getiContentId() {
		return iContentId;
	}

	public void setiContentId(int iContentId) {
		this.iContentId = iContentId;
	}

	public int getiStatusId() {
		return iStatusId;
	}

	public void setiStatusId(int iStatusId) {
		this.iStatusId = iStatusId;
	}

	public int getiMoney() {
		return iMoney;
	}

	public void setiMoney(int iMoney) {
		this.iMoney = iMoney;
	}

	public String getsReason() {
		return sReason;
	}

	public void setsReason(String sReason) {
		this.sReason = sReason;
	}

	public String getsIsUser() {
		return sIsUser;
	}

	public void setsIsUser(String sIsUser) {
		this.sIsUser = sIsUser;
	}

	public String getsIsDate() {
		return sIsDate;
	}

	public void setsIsDate(String sIsDate) {
		this.sIsDate = sIsDate;
	}

	public String getsUpdUser() {
		return sUpdUser;
	}

	public void setsUpdUser(String sUpdUser) {
		this.sUpdUser = sUpdUser;
	}

	public String getsUpdDate() {
		return sUpdDate;
	}

	public void setsUpdDate(String sUpdDate) {
		this.sUpdDate = sUpdDate;
	}

	public boolean issIsDeleted() {
		return sIsDeleted;
	}

	public void setsIsDeleted(boolean sIsDeleted) {
		this.sIsDeleted = sIsDeleted;
	}
}
