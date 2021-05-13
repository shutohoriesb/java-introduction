package com.answer;

// 郵便番号(postalCode)と住所(address)のペアを表す
class PostalCodePair {

    private String postalCode;
    private String address;

    public PostalCodePair(String postalCode, String address) {
        this.postalCode = postalCode;
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // addressを返すメソッドを宣言する
    public String getAddress() {
        return address;
    }
}
