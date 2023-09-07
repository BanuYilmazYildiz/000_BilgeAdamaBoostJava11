package com.bilgeadam.week10.lecture001;

public enum ErrorType {

	DOLU_YER_SECIMI(1001, "Sectiginiz yer doludur"), //
	SINIRLAR_DISINDA(1002, "Yaptiginiz secim sinirlar disarisindadir"),
	AGIRLIK_DUSUK(1003, "Girdiginiz agirlik 100kg altindadir, yüklenemez."),
	GECMIS_TARIH(1004, "Girdiginiz tarih gecmistir, gecerli tarih giriniz"),
	MESAI_GUNU_DISINDA(1005, "Cuma günleri yuk alımı yok");

	private String message;
	private int code;

	private ErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
